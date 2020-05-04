public boolean areSiblings(File fileOne, File fileTwo) {
    // implement me
        String pathOne = fileOne.getParent();
        String pathTwo = fileTwo.getParent();
        return pathOne.equals(pathTwo);
        }