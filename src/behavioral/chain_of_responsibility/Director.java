package behavioral.chain_of_responsibility;

public class Director implements RequestChain {

    private RequestChain requestChain;

    @Override
    public RequestChain setNextChain(RequestChain nextChain) {
        this.requestChain = nextChain;
        return this.requestChain;
    }

    @Override
    public void workRequest(WorkerRequest workerRequest) {
        if (RequestType.CONF.equals(workerRequest.getRequestType())) {
            System.out.println("Director work this reqeust");
        } else {
            this.requestChain.workRequest(workerRequest);
        }
    }
}
