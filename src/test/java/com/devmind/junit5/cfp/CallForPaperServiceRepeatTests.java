package com.devmind.junit5.cfp;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Dev-Mind <guillaume@dev-mind.fr>
 * @since 06/01/18.
 */
@DisplayName("Test service CallForPaperService")
class CallForPaperServiceRepeatTests {

    @Nested
    @DisplayName("submit")
    class Submit{
        @Test
        @DisplayName("should fail when required data are absent")
        public void submitFailOnBadArgument(){
            assertThat(true).isTrue();
        }

        @Test
        @DisplayName("should fail when confirmation email is not send")
        public void submitFailOnEmailError(){
            assertThat(true).isTrue();
        }

        @Test
        @DisplayName("should send email")
        public void submitSendEmail(){
            assertThat(true).isTrue();
        }
    }

    @Nested
    @DisplayName("accept")
    class Accept{
        @Test
        @DisplayName("should send email to session speakers")
        public void acceptSendEmailToSessionSpeakers(){
            assertThat(true).isTrue();
        }

        @Test
        @DisplayName("should fail when speaker email can't be send")
        public void acceptFailOnEmailError(){
            assertThat(true).isTrue();
        }
    }

}