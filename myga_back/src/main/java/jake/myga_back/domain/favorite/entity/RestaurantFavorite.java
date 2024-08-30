package jake.myga_back.domain.favorite.entity;

import jakarta.persistence.*;
import jake.myga_back.domain.member.entity.Member;
import jake.myga_back.domain.restaurant.entity.Restaurant;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "restaurant_favorite")
public class RestaurantFavorite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "restaurant_favorite_id")
    private Long favoriteId;

    @ManyToOne
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @ManyToOne
    @JoinColumn(name = "restaurant_id", nullable = false)
    private Restaurant restaurant;

    @Column(name = "restaurant_favorite_kindness")
    private Double kindness;

    @Column(name = "restaurant_favorite_taste")
    private Double taste;

    @Column(name = "restaurant_favorite_price")
    private Double price;
}

