package blackjack.domain.card;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class DeckTest {

    @Nested
    @DisplayName("draw는")
    class Draw {

        @Test
        @DisplayName("카드 한 장을 반환한다.")
        void returnCard() {
            Deck deck = Deck.create();
            assertThat(deck.draw()).isInstanceOf(Card.class);
        }

        @Test
        @DisplayName("덱이 비었을 경우 예외를 발생시킨다.")
        void throwExceptionOnEmpty() {
            Deck deck = Deck.create();
            for (int i = 0; i < 52; i++) {
                deck.draw();
            }

            assertThatThrownBy(deck::draw)
                .isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessage("덱이 비어 있습니다.");
        }
    }
}