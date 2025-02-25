class Administrator {
    List<ObjectOfInterest> objects = new ArrayList<>();

    public void addObject(String title, String category, boolean owned) {
    ObjectOfInterest obj = new ObjectOfInterest(title, category, owned);
    objects.add(obj);
}

    public List<String> viewObjects() {
        List<String> objectList = new ArrayList<>();
        for (int i = 0; i < objects.size(); i++) {
            objectList.add(objects.get(i).getInfo());
        }
        return objectList;
    }
}
