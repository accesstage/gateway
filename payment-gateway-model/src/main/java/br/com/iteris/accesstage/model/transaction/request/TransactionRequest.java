package br.com.iteris.accesstage.model.transaction.request;

import br.com.iteris.accesstage.model.ClientId;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class TransactionRequest {

    @JsonUnwrapped
    private ClientId clientId;

    @JsonUnwrapped
    private Transaction transaction;

    public TransactionRequest() {}

    public TransactionRequest(ClientId clientId, Transaction transaction) {
        this.clientId = clientId;
        this.transaction = transaction;
    }
}
