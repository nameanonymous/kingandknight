package result;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Duration;
import java.time.ZonedDateTime;

public class GameResult {


    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Entity
    public class GameResult {

        @Id
        @GeneratedValue
        private Long id;

        @Column(nullable = false)
        private String player;

        private boolean solved;

        private int counts;

        @Column(nullable = false)
        private Duration duration;

        @Column(nullable = false)
        private ZonedDateTime created;

        @PrePersist
        protected void onPersist() {
            created = ZonedDateTime.now();
        }

    }
}
