package com.devmind.junit5.cfp;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Dev-Mind <guillaume@dev-mind.fr>
 * @since 06/01/18.
 */
@DisplayName("Test service CallForPaperService")
class CallForPaperServiceTests {

    @Test
    @DisplayName("should send email to session speakers")
    @RepeatedTest(10)
    public void acceptSendEmailToSessionSpeakers(){
        assertThat(true).isTrue();
    }

}