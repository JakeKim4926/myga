package jake.myga_back.domain.restaurant.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "restaurant_detail")
public class RestaurantDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "restaurant_detail_id")
    private Long detailId;

    @OneToOne
    @JoinColumn(name = "restaurant_id", nullable = false)
    private Restaurant restaurant;

    @Column(name = "restaurant_detail_address_kr", length = 1000)
    private String addressKr;

    @Column(name = "restaurant_detail_address_en", length = 1000)
    private String addressEn;

    @Column(name = "restaurant_detail_district")
    private String district;

    @Column(name = "restaurant_detail_number_of_review_visit")
    private Long numberOfReviewVisit;

    @Column(name = "restaurant_detail_number_of_review_Blog")
    private Long numberOfReviewBlog;

    @Column(name = "restaurant_detail_traffic_kr")
    private String trafficKr;

    @Column(name = "restaurant_detail_traffic_en")
    private String trafficEn;

    @Column(name = "restaurant_detail_average_kindness")
    private Double averageKindness;

    @Column(name = "restaurant_detail_average_taste")
    private Double averageTaste;

    @Column(name = "restaurant_detail_average_price")
    private Double averagePrice;
}

