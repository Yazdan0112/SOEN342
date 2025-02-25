class Expert {
    List<String> expertise;

    public Expert(List<String> expertise) {
        this.expertise = expertise;
    }

    public List<String> viewObj(List<ObjectOfInterest> obj) {
    List<String> filteredObj = new ArrayList<>();
    for (ObjectOfInterest obj : objects) {
        if (expertise.contains(obj.category)) {
            filteredObj.add(obj.getInfo());
        }
    }
        }
        return filteredObj;
    }
}
