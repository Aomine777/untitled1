package Tasks8;

public class ShapeInfoCollector {
    public String getInfo(ShapeCharactiristics[] characteristics, Shape s){
        if(characteristics.length >=ShapeCharactiristics.values().length){
            throw new IllegalArgumentException("there is only" + ShapeCharactiristics.values().length  +   "characteristics but you trying to pass more");
        }
        StringBuilder sb = new StringBuilder();
        if (isExists(characteristics,ShapeCharactiristics.NAME)){
            sb.append("name is = ");
            sb.append(s.getName());
        }
        if(isExists(characteristics,ShapeCharactiristics.COLOR)){
            sb.append("color is = ");
            sb.append(s.getColor());
        }
        return sb.toString();
    }

    public boolean isExists(ShapeCharactiristics [] charactiristics, ShapeCharactiristics charactiristic){
        boolean res = false;
        for(ShapeCharactiristics sc: charactiristics){
            if (sc == charactiristic){
                return  true;
            }
        }
        return  false;
    }
}
