package com.relayrides.pushy.apns;

import java.util.Map;
import java.util.Set;

/**
 * A model object representing a change to registered signing keys.
 *
 * @author <a href="https://github.com/jchambers">Jon Chambers</a>
 *
 * @since 0.10
 */
class SigningKeyRegistrationEvent {

    private final Set<String> topicsToClear;
    private final Map<AuthenticationTokenSupplier, Set<String>> authenticationTokenSuppliersToAdd;

    /**
     * Constructs a new signing key registration event with the given set of topics for which to clear previous signing
     * keys and the given map of signing keys to topics to add. Old keys are first cleared, then new keys are added.
     *
     * @param topicsToClear a set of topics for which any existing signing keys should be cleared
     * @param keysToAdd a map of new signing keys to the topics to which they apply
     */
    public SigningKeyRegistrationEvent(final Set<String> topicsToClear, final Map<AuthenticationTokenSupplier, Set<String>> keysToAdd) {
        this.topicsToClear = topicsToClear;
        this.authenticationTokenSuppliersToAdd = keysToAdd;
    }

    public Set<String> getTopicsToClear() {
        return this.topicsToClear;
    }

    public Map<AuthenticationTokenSupplier, Set<String>> getKeysToAdd() {
        return this.authenticationTokenSuppliersToAdd;
    }
}
