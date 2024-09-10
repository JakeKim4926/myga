package jake.myga_back.domain.restaurant.entity;

import jakarta.persistence.*;
import jake.myga_back.domain.favorite.entity.RestaurantFavorite;
import jake.myga_back.domain.review.entity.RestaurantReview;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "restaurant")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "restaurant_id")
    private Long restaurantId;

    @Column(name = "restaurant_name", nullable = false)
    private String name;

    @Column(name = "restaurant_img", length = 1000)
    private String image;

    @Column(name = "restaurant_category")
    private String category;

    @Column(name = "restaurant_score")
    private Double score;

    @Column(name = "restaurant_time", length = 1000)
    private String time;

    @Column(name = "restaurant_link", length = 1000)
    private String link;

    @Column(name = "restaurant_call")
    private String call;

    @OneToOne(mappedBy = "restaurant", cascade = CascadeType.ALL)
    private RestaurantDetail detail;

    @OneToOne(mappedBy = "restaurant", cascade = CascadeType.ALL)
    private RestaurantMenu menu;

    @OneToMany(mappedBy = "restaurant")
    private List<RestaurantFavorite> favorites;

    @OneToMany(mappedBy = "restaurant")
    private List<RestaurantReview> reviews;
}

