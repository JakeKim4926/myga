package jake.myga_back.domain.member.entity;

import jakarta.persistence.*;
import jake.myga_back.domain.favorite.entity.RestaurantFavorite;
import jake.myga_back.domain.review.entity.RestaurantReview;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "member")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long memberId;

    @Column(name = "member_email", nullable = false, unique = true)
    private String email;

    @Column(name = "member_nickname", nullable = false)
    private String nickname;

    @OneToMany(mappedBy = "member")
    private List<RestaurantFavorite> favorites;

    @OneToMany(mappedBy = "member")
    private List<RestaurantReview> reviews;
}

