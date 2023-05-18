public class Main {
    public static void main(String[] args) {
        /*
        В ходе разговора с заказчиком было выяснено,
        что он хочет построить модель города для своей компании
        по кадастровым расчетам, связанным с землепользованием.
    Заказчик сказал, что существуют всего несколько типов недвижимости (RealProperty):
     земельный участок (Land),
     лесной массив(Forest),
     дом(House),
     квартира(Apartment),
     гараж(Garage) и т.д.
   Любой из этих объектов имеет атрибуты:
      кадастровый номер (cadastralNumber),
      стоимость(double price),
      собственника(Person owner)
      площадь (double area).
   Земля имеет такой атрибут как назначение (String purpose):
      земли сельскохозяйственного назначения;
      земли населенных пунктов;
      земли промышленности;
   Лесной массив обладает свойством:
      boolean isProtectedZone - является природоохранной зоной или нет.
   House - обладает полями:
      ArrayList - жильцы,
      количество этажей
   Квартира - обладает полями:
      ArrayList - жильцы,
      количество комнат.
   Гараж обладает полями:
      количество машиномест.
                                           Релиз 1
                Подумайте о том как сделать модель для данных объектов,
                понадобятся ли вам абстрактные классы или интерфейсы?
                Сделайте модель из классов, пропишите отношения наследования.
                Можете сделать это на бумаге или в графическом редакторе.

                                            Релиз 2
             Нужно создать метод, который бы рассчитывал налог на имущество.
             В общем случае налог на имущество рассчитывается в размере 0.1 % рыночной стоимости. (меньше одного процента).
             Вы можете уточнить налог, в зависимости от класса, используя Override.

                                            Релиз 3
                    Создайте массив объектов - и отсортируйте его:
                    сначала по общей стоимости
                    по сумме налога
                    по площади
                    по адресу (в алфавитном порядка)
        Дополнительно можете вынести сортировки в отдельные методы, например, getSortedByPriceList(ArrayList) ...

                                            Релиз 4
              Подойдите творчески к заданию. Добавьте функционал на ваше усмотрение.
         */

        Person ivan = new Person("Ivan","Petrov");
        Person lena = new Person("Lena","Koval");
        Person sonya = new Person("Sonya","Ivanova");

        Land land1 = new Land(ivan,"54:35:091455:15",15,20000,Purpose.SETTLEMENT);
        Land land2 = new Land(lena,"54:35:184532:15",5,500,Purpose.AGRICULTURAL);
        Land land3 = new Land(sonya,"54:35:425753:11",20,120000,Purpose.INDUSTRIAL);
        System.out.println(land1.getPropertyTax());
        System.out.println(land2.getPropertyTax());
        System.out.println(land3.getPropertyTax());

        Forest forest1 = new Forest(new Person("John","Black"),"34:75:1534:97",120,250000,false);
        Forest forest2 = new Forest(new Person("Jack","Tamp"),"64:81:4738:10",220,1250000,true);
        System.out.println(forest1.getPropertyTax());
        System.out.println(forest2.getPropertyTax());






    }
}