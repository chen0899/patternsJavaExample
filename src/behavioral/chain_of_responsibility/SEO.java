package behavioral.chain_of_responsibility;

public class SEO implements RequestChain {

    private RequestChain requestChain;

    @Override
    public RequestChain setNextChain(RequestChain nextChain) {
        this.requestChain = nextChain;
        return requestChain;
    }

    @Override
    public void workRequest(WorkerRequest workerRequest) {

        System.out.println("SEO work this reqeust");
    }
}
