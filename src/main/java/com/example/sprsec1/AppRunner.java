package com.example.sprsec1;

import com.example.sprsec1.model.Person;
import com.example.sprsec1.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

@Component
public class AppRunner implements CommandLineRunner {

    @Autowired
    private PersonRepository personRepository;

    @Override
    @Transactional
    public void run(String... args) {
        PersonsCreatable personsCreation = ()->{
            ArrayList<String> names = new ArrayList(Arrays.asList("Maxim", "John", "Samuil", "Gabriel", "Ilona", "Mikhail", "Sasha", "Peter", "Lu", "Vsevolod","Igor","Ludwig","Barry","Harry","Abraham"," Addison"," Adrian"," Albert"," Alec"," Alfred"," Alvin"," Andrew"," Andy"," Archibald"," Archie"," Arlo"," Arthur"," Arthur"," Austen"," Barnabe"," Bartholomew"," Bertram"," Bramwell"," Byam"," Cardew"," Chad"," Chance"," Colin"," Coloman"," Curtis"," Cuthbert"," Daniel"," Darryl"," David"," Dickon"," Donald"," Dougie"," Douglas"," Earl"," Ebenezer"," Edgar"," Edmund"," Edward"," Edwin"," Elliot"," Emil"," Floyd"," Franklin"," Frederick"," Gabriel"," Galton"," Gareth"," George"," Gerard"," Gilbert"," Gorden"," Gordon"," Graham"," Grant"," Henry"," Hervey"," Hudson"," Hugh"," Ian"," Jack"," Jaime"," James"," Jason"," Jeffrey"," Joey"," John"," Jolyon"," Jonas"," Joseph"," Joshua"," Julian"," Justin"," Kurt"," Lanny"," Larry"," Laurence"," Lawton"," Lester"," Malcolm"," Marcus"," Mark"," Marshall"," Martin"," Marvin"," Matt"," Maximilian"," Michael"," Miles"," Murray"," Myron"," Nate"," Nathan"," Neil"," Nicholas"," Nicolas"," Norman"," Oliver"," Oscar"," Osric"," Owen"," Patrick"," Paul"," Peleg"," Philip"," Phillipps"," Raymond"," Reginald"," Rhys"," Richard"," Robert"," Roderick"," Rodger"," Roger"," Ronald"," Rowland"," Rufus"," Russell"," Sebastian"," Shahaf"," Simon"," Stephen"," Swaine"," Thomas"," Tobias"," Travis"," Victor"," Vincent"," Vincent"," Vivian"," Wayne"," Wilfred"," William"," Winston"," Zadoc"));
            ArrayList<String> surnames = new ArrayList(Arrays.asList("Ivanov","Petrov","Sidorov","Fiodorov", "Volonteev", "Serebrov", "Zemetz", "Herek","Smitt","Mobstick", "Witterson", "Jackson", "Simple","Abramson","Adamson","Adderiy","Addington","Adrian","Albertson","Aldridge","Allford","Alsopp","Anderson","Andrews","Archibald","Arnold","Arthurs","Atcheson","Attwood","Audley","Austin","Ayrton","Babcock","Backer","Baldwin","Bargeman","Barnes","Barrington","Bawerman","Becker","Benson","Berrington","Birch","Bishop","Black","Blare","Blomfield","Boolman","Bootman","Bosworth","Bradberry","Bradshaw","Brickman","Brooks","Brown","Bush","Calhoun","Campbell","Carey","Carrington","Carroll","Carter","Chandter","Chapman","Charlson","Chesterton","Clapton","Clifford","Coleman","Conors","Cook","Cramer","Creighton","Croftoon","Crossman","Daniels","Davidson","Day","Dean","Derrick","Dickinson","Dodson","Donaldson","Donovan","Douglas","Dowman","Dutton","Duncan","Dunce","Durham","Dyson","Eddington","Edwards","Ellington","Elmers","Enderson","Erickson","Evans","Faber","Fane","Farmer","Farrell","Ferguson","Finch","Fisher","Fitzgerald","Flannagan","Flatcher","Fleming","Ford","Forman","Forster","Foster","Francis","Fraser","Freeman","Fulton","Galbraith","Gardner","Garrison","Gate","Gerald","Gibbs","Gilbert","Gill","Gilmore","Gilson","Gimson","Goldman","Goodman","Gustman","Haig","Hailey","Hamphrey","Hancock","Hardman","Harrison","Hawkins","Higgins","Hodges","Hoggarth","Holiday","Holmes","Howard","Jacobson","James","Jeff","Jenkin","Jerome","Johnson","Jones","Keat","Kelly","Kendal","Kennedy","Kennett","Kingsman","Kirk","Laird","Lamberts","Larkins","Lawman","Leapman","Leman","Lewin","Little","Livingston","Longman","MacAdam","MacAlister","MacDonald","Macduff","Macey","Mackenzie","Mansfield","Marlow","Marshman","Mason","Mathews","Mercer","Michaelson","Miers","Miller","Miln","Milton","Molligan","Morrison","Murphy","Nash","Nathan","Neal","Nelson","Nevill","Nicholson","Nyman","Oakman","Ogden","Oldman","Oldridge","Oliver","Osborne","Oswald","Otis","Owen","Page","Palmer","Parkinson","Parson","Pass","Paterson","Peacock","Pearcy","Peterson","Philips","Porter","Quincy","Raleigh","Ralphs","Ramacey","Reynolds","Richards","Roberts","Roger","Russel","Ryder","Salisburry","Salomon","Samuels","Saunder","Shackley","Sheldon","Sherlock","Shorter","Simon","Simpson","Smith","Stanley","Stephen","Stevenson","Sykes","Taft","Taylor","Thomson","Thorndike","Thornton","Timmons","Tracey","Turner","Vance","Vaughan","Wainwright","Walkman","Wallace","Waller","Walter","Ward","Warren","Watson","Wayne","Webster","Wesley","White","WifKinson","Winter","Wood","Youmans","Young"));
            ArrayList<String> cities = new ArrayList(Arrays.asList("Khabarovsk", "Moscow", "Berlin", "Tokyo", "StPetersburg", "LosAngeles", "Kiev","Adana","Addis Ababa","Adelaide","Accra","Aktyubinsk/ Aktobe","Alexandria","Algiers","Almaty","Amsterdam","Ankara","Antalya","Antananarivo","Antwerp","Anshan","Ahmedabad","Astana","Asuncion","Athens","Ashgabat","Baghdad","Basel","Baku","Bangalore","Bangkok","Bandung","Barranquilla","Barcelona","Batumi","Beirut","Belgrade","Belo Horizonte","Berlin","Birmingham","Berne","Bishkek","Babruysk, Bobruysk","Bogota","Bordeaux","Brasilia","Bratislava","Brest","Brisbane","Budapest","Bukhara","Bucharest","Buenos Aires","Bhopal","Valencia","Varna","Warsaw","Washington","Wellington","Vienna","Venice","Vilnius","Vitebsk","The Hague","Havana","Hamburg","Kaohsiung","Guadalajara","Guatemala","Gdansk","Ghent","Gothenburg","Jilin","Glasgow","Gomel","Grodno, Hrodna","Guangzhou","Guiyang","Guayaquil","Dakar","Dhaka, Dacca","Dallas","Dalian","Damascus","Dar es Salaam","Delhi","Jaipur","Jakarta","Dnipropetrovsk","Donetsk","Dresden","Dublin","Douala","Dushanbe","Duesseldorf","Yerevan","Geneva","Zhytomyr","Zagreb","Zaporizhia","Jerusalem","Indore","Ibadan","Izmir","Innsbruck","Incheon","Yokohama","Islamabad","Esfahan","Kawasaki","Cairo","Santiago de Cali","Calcutta","Cannes","Kanpur","Caracas","Karaganda","Karachi","Karlovy Vary","Casablanca","Kaunas","Gwangju","Cologne","Quezon City","Kiev","Kinshasa","Kyoto","Quito","Kishinev","Klaipeda","Kobe","Conakry","Copenhagen","Cordoba","Krakow","Kuala Lumpur","Kunming","Lagos","Lucknow","Lanzhou","Lahore","Leipzig","Liverpool","Lima","Limassol","Lyons","Lisbon","Lausanne","London","Los Angeles","Luanda","Lviv","Luxembourg","Madrid","Manaus","Manila","Maputo","Maracaibo","Marseilles","Medan","Medellin","Melbourne","Mexico","Mashhad","Milan","Minsk","Mahilyow","Montreal","Montevideo","Monterrey","Mumbai","Munich","Nagoya","Nagpur","Nairobi","Nanjing","Nanchang","Narva","Naples","Nicosia","New York","Odessa","Osaka","Oslo","Ottawa","Palembang","Paris","Beijing","Perth","Poznan","Porto Alegre","Potsdam","Prague","Pune","Busan","Pyongyang","Recife","Riga","Rome","Rio (de) Janeiro","Rotterdam","Salvador","Samarkand","San Diego","Sao Paulo","San Francisco","Santo Domingo","Santiago","Sapporo","Sevastopol","Seoul","Xi'an","Sydney","Simferopol","Singapore","Salt Lake City","Sofia","Istanbul","Surabaya","Surat","Taipei","Taiyuan","Tallinn","Tangshan","Tartu","Tashkent","Tbilisi","Tabriz","Teh(e)ran","Tel Aviv","Tiraspol","Tokyo","Toronto","Toulouse","Daegu, Taegu","Daejeon","Tianjin","Urumchi","Utrecht","Wuhan","Philadelphia","Phoenix","Florence","Frankfort on the Main","Frankfort on the Oder","Fukuoka","Fushun","Haifa","Aleppo","Hanoi","Hangzhou","Harare","Harbin","Kharkiv","Helsinki","Hiroshima","Ho Chi Minh","Houston","Jinan","Zibo","Qingdao","Qiqihar","Zurich","Changchun","Changsha","Chicago","Chittagong","Chongqing","Chengdu","Shanghai","Shymkent","Shenyang","Szczecin","Eilat","Eindhoven","Giza","Kuwait","Riyadh","Jurmala","Yangon, Rangoon"));

            var random = new Random();

            return Person.builder()
                    .name(names.get(random.nextInt(names.size())))
                    .surname(surnames.get(random.nextInt(surnames.size())))
                    .city(cities.get(random.nextInt(cities.size())))
                    .age((byte) random.nextInt(127))
                    .phoneNumber(String.valueOf(random.nextInt(100_000_000)))
                    .build();
        };
        var limit = 1000;
        IntStream.range(0,limit).forEach(i->personRepository.save(personsCreation.create()));
    }

    private interface PersonsCreatable{
        Person create();
    }

}
