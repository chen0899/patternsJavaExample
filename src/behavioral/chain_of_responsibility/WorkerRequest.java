package behavioral.chain_of_responsibility;

public class WorkerRequest {

    private Double amount;
    private RequestType requestType;

    public WorkerRequest(Double amount, RequestType requestType) {
        this.amount = amount;
        this.requestType = requestType;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }
}
