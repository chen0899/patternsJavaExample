package behavioral.chain_of_responsibility;

public class Main {

    public static void main(String[] args) {
        WorkerRequest workerRequest = new WorkerRequest(1800., RequestType.CONF);

        Director director = new Director();
        VicePresident vicePresident = new VicePresident();
        SEO seo = new SEO();
        director.setNextChain(vicePresident);
        vicePresident.setNextChain(seo);

        director.workRequest(workerRequest);
    }
}
