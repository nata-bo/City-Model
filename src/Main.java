import java.util.ArrayList;
import java.util.List;

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

        Person ivan = new Person("Ivan", "Petrov");
        Person lena = new Person("Lena", "Koval");
        Person sonya = new Person("Sonya", "Ivanova");
        Person john = new Person("John", "Black");
        Person jack = new Person("Jack", "Tamp");

        Land land1 = new Land(ivan, "54:35:091455:15", 15, 20000, "Lemberg", Purpose.SETTLEMENT);
        Land land2 = new Land(lena, "54:35:184532:15", 5, 500, "Belgorod", Purpose.AGRICULTURAL);
        Land land3 = new Land(sonya, "54:35:425753:11", 20, 120000, "Bamberg", Purpose.INDUSTRIAL);
        System.out.println(land1.getPropertyTax());
        System.out.println(land2.getPropertyTax());
        System.out.println(land3.getPropertyTax());

        Forest forest1 = new Forest(john, "34:75:1534:97", 120, 250000, "Kiev", false);
        Forest forestPark = new Forest(jack, "64:81:4738:10", 220, 1250000, "Munchberg", true);
        System.out.println(forest1.getPropertyTax());
        System.out.println(forestPark.getPropertyTax());

        ArrayList<Person> residentsList = new ArrayList<>(List.of(ivan, lena, sonya, jack, john));
        ArrayList<Person> residentsList2 = new ArrayList<>(List.of(ivan, sonya));
        ArrayList<Person> residentsList3 = new ArrayList<>(List.of(lena));

        House house1 = new House(jack, "38:18:23612:32", 350, 980000, "Lviv", 3, residentsList);
        System.out.println(house1.getPropertyTax());

        Apartment apartment1 = new Apartment(ivan, "21:47:92306:21", 100, 250000, "Seattle", 3, residentsList2);
        System.out.println(apartment1.getPropertyTax());

        Garage garage1 = new Garage(lena, "10:32:64321:47", 25, 10000, "Bremen", 1);
        System.out.println(garage1.getPropertyTax());

        ArrayList<RealProperty> arrayOfEstates = new ArrayList<>(List.of
                (land1, land2, land3, forest1, forestPark, house1, apartment1, garage1)
        );
//        arrayOfEstates.sort(new PropertyByAddressComparator());
//        System.out.println(arrayOfEstates);
//        arrayOfEstates.sort(new PropertyByTaxAmountComparator());
//        System.out.println(arrayOfEstates);
//        arrayOfEstates.sort(new PropertyByAreaComparator());
//        System.out.println(arrayOfEstates);
//        arrayOfEstates.sort(new PropertyByTotalPriceComparator());
//        System.out.println(arrayOfEstates);

        getSortedByPriceList(arrayOfEstates);
        System.out.println(arrayOfEstates);
        getSortedByListTaxAmount(arrayOfEstates);
        System.out.println(arrayOfEstates);
        getSortedListByAddress(arrayOfEstates);
        System.out.println(arrayOfEstates);
        getSortedListByArea(arrayOfEstates);
        System.out.println(arrayOfEstates);

        addHouseOnTheLand(land1,
                new House(ivan, "36:76:85432:54", 250, 250000, "Dondorf", 2, residentsList2));
        addHouseOnTheLand(land2,
                new House(lena, "34:87:07008:78", 100, 25000, "Kemnat", 1, residentsList3));

        changedOwnerOfApartment(jack, apartment1);
        System.out.println(apartment1);

        forest1.addTree(250);
        System.out.println(forest1);
        forest1.removeTree(25);
        System.out.println(forest1);


       List<Forest> forestList = divForestIntoTwoParts(forest1, lena, sonya);
        Forest forest2 =forestList.get(0);
        Forest forest3 = forestList.get(1);
        System.out.println(forest2);
        System.out.println(forest3);
        Land changeLand = changePurposeToSETTLEMENT(forest2);
        System.out.println(changeLand);
    }


    public static void getSortedByPriceList(ArrayList<RealProperty> list) {
        list.sort(new PropertyByTotalPriceComparator());
    }

    public static void getSortedListByArea(ArrayList<RealProperty> list) {
        list.sort(new PropertyByAreaComparator());
    }

    public static void getSortedByListTaxAmount(ArrayList<RealProperty> list) {
        list.sort(new PropertyByTaxAmountComparator());
    }

    public static void getSortedListByAddress(ArrayList<RealProperty> list) {
        list.sort(new PropertyByAddressComparator());
    }

    //строительство дома на участке
    public static void addHouseOnTheLand(Land land, House house) {
        if (land.getPurpose() == Purpose.SETTLEMENT || land.getPurpose() == Purpose.INDUSTRIAL) {
            land.addHouse(house);
            System.out.println("Дом " + house + " построен");
        } else {
            System.out.println("Строительство домов в сельскохозяйственной зоне запрещено");
        }
    }

    // метод, который меняет собственника
    public static void changedOwnerOfApartment(Person person, Apartment apartment) {
        apartment.setOwner(person);
    }

    public static List<Forest> divForestIntoTwoParts(Forest forest, Person person1, Person person2) {
        double area1 = forest.getArea() * 0.1;
        int tree1 = forest.getTree() * 10 / 100;
        double area2 = forest.getArea() - area1;
        int tree2 = forest.getTree() - tree1;
        Forest forest2 = new Forest(person1, "20:10:99088:24", area1, 200000, "Kiev", false);
        forest2.setTree(tree1);
        Forest forest3 = new Forest(person2, "52:98:00043:14", area2, 50000, "Kiev", false);
        forest3.setTree(tree2);
        return new ArrayList<>(List.of(forest2, forest3));
    }
      // метод, который меняет назначение участка с леса на землю под строительство дома
    public static Land changePurposeToSETTLEMENT(Forest forest){
        forest.removeTree(forest.getTree());
        return new Land(forest.getOwner(),forest.getCadastralNumber(),
                forest.getArea(), forest.getPrice(), forest.getAddress(),Purpose.SETTLEMENT );
    }


}