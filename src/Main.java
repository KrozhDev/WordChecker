import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        String s2 = "An anchor of UK communities for centuries, Post Office is a commercial business driven by a strong social purpose: to be here, in person, for the people who rely on us.\n" +
                "Our role and reach\n" +
                "Thanks to our extensive network of over 11,500 branches, we bring essential services within reach of communities and businesses alike – whether that’s posting parcels to loved ones, depositing cash at the end of the working day or topping up the gas meter.\n" +
                "\n" +
                "In fact, Post Office is the largest retailer in the UK, meaning we alone are placed at the heart of communities across England, Wales, Scotland and Northern Ireland. We ensure 99.7% of the population lives within 3 miles of a post office and 93% live within 1 mile. We do this nearly entirely on a franchise basis in partnership with independent business owners who operate post offices, known as Postmasters, as well as other retail partners.\n" +
                "\n" +
                "The value we bring\n" +
                "We are an anchor to the UK’s high streets, providing essential mails and banking services to some six million small businesses and acting a crucial bridge between the online and offline economy. We also help drive footfall to high streets, with one in three people visiting other high street locations – like pubs or shops – on a trip to their post office, driving an estimated £1.1 billion in additional revenue to the UK economy.\n" +
                "\n" +
                "However, not all value can be counted in economic terms. Our post offices offer more than just a range of services; they are the community hubs of many towns and villages across the UK, especially for older and vulnerable people. For many, Post Office remains an important source of day-to-day social interaction, while providing access to their essential needs – and that’s why Post Office is ranked as having the most positive impact in the community by the Association of Convenience Stores (ACS).\n" +
                "\n" +
                "The Covid-19 pandemic shone a spotlight on the vital lifeline we offer to communities. We worked hard to keep our network open and ensure that customers, especially the vulnerable, could continue to access our services, even as the high street grew quiet.\n" +
                "\n" +
                "The future of Post Office\n" +
                "We value our long history of service in the UK, and want to remain one of the most admired institutions in the public sector. Following our separation from Royal Mail in 2012, we are on a journey to evolve into a sustainable, successful and sought-after franchise business so that we continue to meet the ever-changing needs of our customers.\n" +
                "\n" +
                "For example, we know that our network will be a key part of the physical infrastructure that the UK’s digital economy will require. To help shape our strategy in the years ahead, we have clear intent for where Post Office will be by 2025. You can read more about this";

        WordChecker wc = new WordChecker(s2);


        long startTime = System.nanoTime();
        System.out.println(wc.hasWord("intent"));
        long endTime = System.nanoTime();
        long durationHash = (endTime - startTime);

        long startTime2 = System.nanoTime();
        System.out.println(s2.contains("intent"));
        long endTime2 = System.nanoTime();

        long durationString = (endTime2 - startTime2);


        System.out.println("Время поиска слова через HashSet: " +  durationHash);
        System.out.println("Время поиска слова через String: " +  durationString);






    }
}
