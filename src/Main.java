import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Aratati in sirurile urmatoare daca exista valori care au acelasi numar de aparitii (ex: 1 o data, 2 de doua ori...): \n ");
// verificare

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3,3, 3,2,4));
        List<Integer> noDuplicateList=list.stream().distinct().toList();
            System.out.println("list: "+list);
        Map<Integer, Integer> map =new LinkedHashMap<>();
        Integer value;
        for (Integer i:list){
             value = map.get(i); // map de cheie
            if (value==null){
                map.put(i, 1);
            }else {
                map.put(i, value+1);
            }
        }
        System.out.println("Situatia sta asa: "+map+"\n");
        String valoareDeAdevar = null;
        for (Integer h:noDuplicateList ){
            if (h== map.get(h)){
               System.out.println("                   "+h +" este afista de "+h+" ori");
                valoareDeAdevar= "true";
            }
        }
        if (valoareDeAdevar!=null){
            System.out.println("                               true");
        }else {
            System.out.println("                   false");
        }

////Speta 1
        System.out.println("**");
        System.out.println("********* SPETA 1 **************");
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 2, 1, 1, 3));
        List<Integer> noDuplicateList1=list1.stream().distinct().toList();
        System.out.println("list: "+list1);
        Map<Integer, Integer> map1 =new LinkedHashMap<>();
        int value1 = 0;
        for (Integer i:list1){
            value = map1.get(i); // map de cheie
            if (value==null){
                map1.put(i, 1);
            }else {
                map1.put(i, value1+1);
            }
        }
        System.out.println("Situatia sta asa: "+map1+"\n");
        String valoareDeAdevar1 = null;
        for (Integer h:noDuplicateList1 ){
            if (h== map1.get(h)){
                System.out.println("                   "+h +" este afista de "+h+" ori");
                valoareDeAdevar1= "true";
            }
        }
        if (valoareDeAdevar1!=null){
            System.out.println("                               true");
        }else {
            System.out.println("                   false");
        }


//////Speta 2
        System.out.println("**");
        System.out.println("********* SPETA 2 **************");
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2));
        List<Integer> noDuplicateList2=list2.stream().distinct().toList();
        System.out.println("list: "+list2);
        Map<Integer, Integer> map2 =new LinkedHashMap<>();
        Integer value2;
        for (Integer i:list2){
            value = map2.get(i); // map de cheie
            if (value==null){
                map2.put(i, 1);
            }else {
                map2.put(i, value+1);
            }
        }
        System.out.println("Situatia sta asa: "+map2+"\n");
        String valoareDeAdevar2 = null;
        for (Integer h:noDuplicateList2 ){
            if (h== map2.get(h)){
                System.out.println("                   "+h +" este afista de "+h+" ori");
                valoareDeAdevar2= "true";
            }
        }
        if (valoareDeAdevar2!=null){
            System.out.println("                               true");
        }else {
            System.out.println("                   false");
        }
//


////Speta3
        System.out.println("**");
        System.out.println("********* SPETA 2 **************");
        List<Integer> list3 = new ArrayList<>(Arrays.asList(-3,0,1,-3,1,1,1,-3,10,0));
        List<Integer> noDuplicateList3=list3.stream().distinct().toList();
        System.out.println("list: "+list3);
        Map<Integer, Integer> map3 =new LinkedHashMap<>();
        Integer value3;
        for (Integer i:list3){
            value = map3.get(i); // map de cheie
            if (value==null){
                map3.put(i, 1);
            }else {
                map3.put(i, value+1);
            }
        }
        System.out.println("Situatia sta asa: "+map3+"\n");
        String valoareDeAdevar3 = null;
        for (Integer h:noDuplicateList3 ){
            if (h== map3.get(h)){
                System.out.println("                   "+h +" este afista de "+h+" ori");
                valoareDeAdevar3= "true";
            }
        }
        if (valoareDeAdevar3!=null){
            System.out.println("                               true");
        }else {
            System.out.println("                   false");
        }
    }
}