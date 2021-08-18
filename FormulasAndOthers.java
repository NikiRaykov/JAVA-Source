public class FormulasAndOthers {
    //created by J.M.
     /*
        ------------------------------------------------------------------------------------------------------
        Locale.setDefault(Locale.US); точка вместо запетая в конзолата
        ------------------------------------------------------------------------------------------------------
        private static Double getAverage(List<Double> value) {
        double average = 0.0;
        for (Double aDouble : value) {
            average += aDouble;
        }
        return average / value.size();
        }
        -----------------------------------------------------------------------------------------------------
        matches("^[^0-9]+$") - if not have digit = true - if have digit = false
        matches("^[0-9]+$") - if have only digits = true
        ------------------------------------------------------------------------------------------------------
        sum matrix elements -
        Arrays.stream(matrix).mapToInt(arr->Arrays.stream(arr).sum()).sum());
        ------------------------------------------------------------------------------------------------------
                                          ФОРМУЛИ:
         ЗА РАЗТОЯНИЕ МЕЖДУ ДВЕ ТОЧКИ В КООРДИНАТНА СИСТЕМА
         Line= Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
         ЗА РАЗТОЯНИЕ ОТ ЦЕНТЪРА ДО ТОЧКА - Math.sqrt(Math.pow(x1,2) + Math.pow(y1,2)
        -------------------------------------------------------------------------------------------------------
         -boolean- с тернарен оператор ,добавя в мап кей със стойност ако не съществува ,а ако съществува увеличава стойноста:
         userInfo.put(user,!userInfo.containsKey(user)?points:userInfo.get(user)+points);
         изтрива от листа брой позиции ако са валидни индексите:
         if (endIndex >= startIndex) {
                        numbers.subList(startIndex, endIndex + 1).clear();
                   }
         - броя на уникалните символи в текст :
         text.chars().distinct().count()
         - сумира интиджерите в матрица :
         Arrays.stream(matrix).flatMapToInt(IntStream::of).sum();
         Arrays.stream(matrix).mapToInt(arr->Arrays.stream(arr).sum()).sum());
        --------------------------------------------------------------------------------------------------------
        Вади версиата на JAVA:
        System.out.println(System.getProperty("java.version"));
        --------------------------------------------------------------------------------------------------------
        @Override
        public int hashCode(){
        return (произволно число ) * Objects.hash(параметрите в конструктура на класа);
        }
        @Override
        public boolean equals(Object o){
            if( this == o ){
            return true;
            }
            if( this.getClass() != o.getClass() ){
            return false;
            }
            класа other = (класа) о; - обекта кастнат към същия клас:
            return this.field.equals(other.field) && за всяко поле от класа:
        }
        --------------------------------------------------------------------------------------------------------
      */
}