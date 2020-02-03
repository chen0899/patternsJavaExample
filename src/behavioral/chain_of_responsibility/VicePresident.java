package behavioral.chain_of_responsibility;

public class VicePresident implements RequestChain {

    private RequestChain requestChain;

    @Override
    public RequestChain setNextChain(RequestChain nextChain) {
        this.requestChain = nextChain;
        return this.requestChain;
    }

    @Override
    public void workRequest(WorkerRequest workerRequest) {
        if (RequestType.PURCHASE.equals(workerRequest.getRequestType()) && workerRequest.getAmount() <= 1500) {
            System.out.println("VicePresident work this reqeust");
        } else {
            this.requestChain.workRequest(workerRequest);
        }
    }
}
