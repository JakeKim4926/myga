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

    @Column(name = "restaurant_detail_address_kr")
    private String addressKr;

    @Column(name = "restaurant_detail_address_en")
    private String addressEn;

    @Column(name = "restaurant_detail_service")
    private String service;

    @Column(name = "restaurant_detail_traffic")
    private String traffic;

    @Column(name = "restaurant_detail_average_kindness")
    private Double averageKindness;

    @Column(name = "restaurant_detail_average_taste")
    private Double averageTaste;

    @Column(name = "restaurant_detail_average_price")
    private Double averagePrice;
}

