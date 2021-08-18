public class SortExamples {

/*
        ---------------------------------------------------------------------------------------------------------
                       Лист:
         Collections.sort(името на листа,(a,b) -> (a,b);
         за сравняване на всичко - пример дължина на колкото и да са стринговете в листа
         Collections.sort(името на листа,(a,b) -> Integer.compare(a.length(),b.length());
                       Лист от клас Team:
                сорт по име:
                teamsList.sort (Comparator.comparing (Team::getName));
                сорт по брой на членовете в низходящ ред:
                teamsList.sort (Comparator.comparingInt (Team::getMembersSize).reversed ());
                teamsList.stream ().sorted((t1,t2)->{
                    int result =Integer.compare (t2.getMembersSize (), t1.getMembersSize ());
                    if (result==0){
                        result = t1.getName ().compareTo (t2.getName ());
                    }
                    return result;
                });
        ---------------------------------------------------------------------------------------------------------
                           СОРТИРОВКА НА МАП:
                сортировка по стойност в низходящ ред и след това по кей:
                stringIntegerMap
                        .entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                        .sorted(Map.Entry.comparingByKey())
                        .forEach(entry -> System.out.printf("%s: %d%n", entry.getKey (),entry.getValue ()));
              sorted((a,b)->{int sort=b.getValue().compareTo(a.getValue());
                        if(sort==0) {
                            String[] colorOfA = a.getKey().split(" ");
                            String[] colorOfB = b.getKey().split(" ");
                             sort=countColors.get(colorOfB[0]).compareTo(countColors.get(colorOfA[0]));
                        }
                            return sort;
                        })...
          stringIntegerMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()))
                .forEach(e -> System.out.printf("%s: %d%n", e.getKey(), e.getValue()));
          stringListStringMap.entrySet().stream().sorted((list1,list2)->Integer.compare(list2.getValue ().size (),list1.getValue ().size ()))
                 .forEach (entry->{ System.out.printf ("%s: %d%n", entry.getKey (),entry.getValue ().size ());
                  entry.getValue ().stream ().sorted (String::compareTo)
                  .forEach (element-> System.out.printf ("-- %s%n",element));});
          .sorted((s1, s2) -> {
                      double first = s1.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
                      double second = s2.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
                      return Double.compare(second, first);
          mapInformation.entrySet().stream().filter(users -> users.getValue().size() > 0)
                .sorted(Map.Entry.<String, List<String>>comparingByValue(Comparator.comparing(List::size)).reversed())
                .forEach(s -> { System.out.printf("Side: %s, Members: %d%n", s.getKey(), s.getValue().size());
                s.getValue().stream().sorted(String::compareTo).forEach(person -> System.out.printf("! %s%n", person));});
        --------------------------------------------------------------------------------------------------*/

}