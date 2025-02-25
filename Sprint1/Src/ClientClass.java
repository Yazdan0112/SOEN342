class Client {
    public List<String> viewObjects(List<ObjectOfInterest> objects) {
    List<String> objectList = new ArrayList<>();
    for (int i = 0; i < objects.size(); i++) {
        objectList.add(objects.get(i).getInfo());
    }
    return objectList;
}
}
