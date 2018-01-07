package com.devmind.junit5.cfp;

/**
 * @author Dev-Mind <guillaume@dev-mind.fr>
 * @since 06/01/18.
 */
public interface CallForPaperService {
    void submit(Proposal proposal);
    void accept(Proposal proposal);
    void refuse(Proposal proposal);
}
