package behavioral.chain_of_responsibility;

public interface RequestChain {

    RequestChain setNextChain(RequestChain nextChain);

    void workRequest(WorkerRequest workerRequest);
}
