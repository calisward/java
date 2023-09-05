class ResistorColorDuo {
    int colorCode(String color){
        color = color.toLowerCase();
        switch(colors) {
            case "Black":
                value = 0;
                break;
            case "Brown":
                value = 1;
                break;
            case "Red":
                value = 2;
                break;
            case "Orange":
                value = 3;
                break;
            case "Yellow":
                value = 4;
                break;
            case "Green":
                value = 5;
                break;
            case "Blue":
                value = 6;
                break;
            case "Violet":
                value = 7;
                break;
            case "Grey":
                value = 8;
                break;
            case "White":
                value = 9;
                break;
            default:
                null;
                break;
        }
    }
      int value(String[] colors) {
                String[] colorArray = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        return colorArray;
            }
}
