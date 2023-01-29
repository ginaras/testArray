import java.util.*;
import java.util.stream.Collectors;

public class rezovareProblema {

    public static void main(String[] args) {
        System.out.println("Aratati in sirurile urmatoare daca exista valori care au acelasi numar de aparitii (): \n ");

        String caz="exemplu 1";
            List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 3, 2, 4));
        String caz1="exemplu 1";
            List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 2, 1, 1, 3));
        String caz2="exemplu 2";
            List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2));
        String caz3="exemplu 3";
            List<Integer> list3 = new ArrayList<>(Arrays.asList(-3, 0, 1, -3, 1, 1, 1, -3, 10, 0));

        List<List> liste = new ArrayList<>();
        liste.add(list);
        liste.add(list1);
        liste.add(list2);
        liste.add(list3);

        for (List listele: liste) {
            if (listele == list){list=list; caz = caz;}
            if (listele == list1){list=list1;caz = caz1;}
            if (listele == list2){list=list2; caz = caz2;}
            if (listele == list3){list=list3; caz = caz3;}

            List<Integer> noDuplicateList = list.stream().distinct().toList();
            System.out.println(caz+"    -lista: " + list);
            Map<Integer, Integer> map = new LinkedHashMap<>();
            Integer value;
            for (Integer i : list) {
                value = map.get(i); // map de cheie
                if (value == null) {
                    map.put(i, 1);
                } else {
                    map.put(i, value + 1);
                }
            }
            List<Integer> listaPerechiCuAcelasiNrDeAparitii = new ArrayList<>();
            System.out.println("Situatia sta asa (valoare = numar de aparitii): " + map );
            String valoareDeAdevar;
            for (Integer h : noDuplicateList) {
                for (h = 1; h < noDuplicateList.size(); h++) {
                    for (int n : noDuplicateList)
                        if (map.get(h) == map.get(n) && h != n) {
                            listaPerechiCuAcelasiNrDeAparitii.add(n);
                            listaPerechiCuAcelasiNrDeAparitii.add(h);
                        }
                }
            }

            List<Integer> listaPerechiCuAcelasiNrDeAparitiiUnic = listaPerechiCuAcelasiNrDeAparitii.stream().sorted().distinct().collect(Collectors.toList());
            valoareDeAdevar=(listaPerechiCuAcelasiNrDeAparitiiUnic.size() != 0) ?
                    ("lista cu nalori care apar de acelasi numar de ori este "+listaPerechiCuAcelasiNrDeAparitiiUnic) + " raspuns: FALSE":
                    ("lista cu nalori care apar de acelasi numar de ori este vida raspuns TRUE");
            System.out.println(valoareDeAdevar + "\n");
        }
    }
}

