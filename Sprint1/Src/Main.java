public class ArtAdvisorySystem {
    public static void main(String[] args) {
        Administrator admin = new Administrator();
        admin.addObject("red Vase", "vase", true);
        admin.addObject("green Manuscript", "Manuscripts", false);

        Expert expert = new Expert(List.of("Manuscripts", "Paintings"));
        Client client = new Client();

        System.out.println("Administrator layout:");
        List<String> adminObjects = admin.viewObjects();
        for (int i = 0; i < adminObjects.size(); i++) {
            System.out.println(adminObjects.get(i));
        }

        System.out.println("Expert layout:");
        List<String> expertObjects = expert.viewObjects(admin.objects);
        for (int i = 0; i < expertObjects.size(); i++) {
            System.out.println(expertObjects.get(i));
        }

        System.out.println("Client layout:");
        List<String> clientObjects = client.viewObjects(admin.objects);
        for (int i = 0; i < clientObjects.size(); i++) {
            System.out.println(clientObjects.get(i));
        }
    }
