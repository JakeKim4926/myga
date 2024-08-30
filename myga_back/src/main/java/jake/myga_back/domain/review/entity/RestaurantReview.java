package jake.myga_back.domain.review.entity;

import jakarta.persistence.*;
import jake.myga_back.domain.member.entity.Member;
import jake.myga_back.domain.restaurant.entity.Restaurant;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "restaurant_review")
public class RestaurantReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "restaurant_review_id")
    private Long reviewId;

    @ManyToOne
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @ManyToOne
    @JoinColumn(name = "restaurant_id", nullable = false)
    private Restaurant restaurant;

    @Column(name = "restaurant_review_board")
    private String board;
}
