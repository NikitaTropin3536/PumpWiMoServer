package com.app.pumpwimo.pumpwimoapi.humans;

import com.app.pumpwimo.pumpwimoapi.humans.models.Person;
import com.app.pumpwimo.pumpwimoapi.humans.repositories.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// todo Если вы будете читать код в этом классе, то сразу предупрежу -
// todo - писать так, как я пишу тут - не принято (создавать объекты с огромным
// todo - количеством ааргументов в коде. Для этого используют Json).
// todo - в будущемэтот код будет подвергнут жесточайшему code review!

@Configuration
public class PersonConfiguration {

    /* список людей */
    private List<Person> persons = new ArrayList<>();

    /* имена людей */
    private List<String> personNames = new ArrayList<>();

    /* фотки */
    private List<String> personPhotos = new ArrayList<>();

    /* что люди сделали? */
    private List<String> personWhatDo = new ArrayList<>();

    /* предисловия */
    private List<String> personSummaries = new ArrayList<>();

    /* ссылки на источники с полными биографиями */
    private List<String> infoLinks = new ArrayList<>();

    /* ссылки на источники с дополнительной информацией */
    private List<String> dopLinks = new ArrayList<>();

    /* метод для заполнения списка с именами */
    private void fillPersonNames() {
        personNames.addAll(Arrays.asList(

                "Сильвестр Сталлоне", "Ли Бён Чхоль", "Соичиро Хонда",

                "Киичиро Тойода", "Джимми Уэйлс", "Джерри Янг",

                "Ларри Пейдж", "Сергей Брин", "Джоан Роулинг",

                "Миучча Прада Бианки", "Илон Маск", "Мэри Кэй Эш",

                "Рэй Крок", "Филл Найт", "Томас Эдисон",

                "Коко Шанель", "Марк Цукерберг", "Уолт Дисней",

                "Акио Морита", "Евгений Чичваркин", "Опра Уинфри",

                "Майкл Джордан", "Ричард Бренсон", "Роберт Кийосаки",

                "Уоррен Баффет", "Стив Джобс", "Стив Возняк",

                "Генри Форд", "Билл Гейтс", "Маргарет Тэтчер",

                "Ларри Эллисон", "Амансио Ортега", "Бернар Арно",

                "Стивен Кинг", "Стивен Спилберг", "Майкл Блумберг",

                "Джефф Безос", "Джек Ма", "Стивен Хокинг",

                "Павел Дуров", "Чжоу Цюньфей", "Татьяна Бакальчук",

                "Мадонна", "Карлос Слим Элу",

                "Говард Шульц",

                "Алексей Хлопков", "Иван Мурзин",

                "Максим Садков", "Даниил Покровский",

                "Арсений Аношин", "Александр Ошаров"
        ));
    }

    /* метод для заполнения списка с фотками */
    private void fillPersonPhotos() {
        personPhotos.addAll(Arrays.asList(

                // Сильвестр Сталлоне
                "https://wallsdesk.com/wp-content/uploads/2016/11/Sylvester-Stallone-Computer-Backgrounds.jpg",

                // Ли Бён Чхоль
                "https://www.istmira.com/uploads/posts/2019-03/1553800465_3165978-hzxyeape-7.jpg",

                // Соичиро Хонда
                "https://a.d-cd.net/59ee69es-960.jpg",

                // Киичиро Тойода
                "https://avtoremont-shop.ru/wp-content/uploads/3564638.jpg",

                // Джимми Уэйлс
                "https://upload.wikimedia.org/wikipedia/commons/6/6f/Jimmy_Wales_July_2010_3.jpg",

                // Джерри Янг"
                "https://cloudfront-eu-central-1.images.arcpublishing.com/prisa/BGCAYJIEI5EMRFSMZYJ5BCUFEM.jpg",

                // Ларри Пейдж
                "https://rb.ru/media/upload_tmp/lp17.jpg",

                // Сергей Брин
                "https://i.insider.com/5de6eac8fd9db25c5b3b7feb?width=1000&format=jpeg&auto=webp",

                // Джоан Роулинг
                "https://haipovo.ru/wp-content/uploads/2023/01/dzhoan-rouling-napishet-vosmuyu-knigu-o-garri-pottere.jpg",

                // Миучча Прада Бианки
                "https://process.fs.grailed.com/AJdAgnqCST4iPtnUxiGtTz/cache=expiry:max/rotate=deg:exif/resize=width:2400,fit:crop/output=quality:70/compress/https://process.fs.grailed.com/hcy1YVhSNq4KhUb114bw",

                // Илон Маск
                "https://www.topnews.ru/wp-content/uploads/2021/05/Mask.jpg",

                // Мэри Кэй Эш
                "https://everipedia-storage.s3.amazonaws.com/ProfilePicture/en/Mary_Kay_Ash__8d715d/Mary_Kay_Ash.jpg__95160_original.webp",

                // Рэй Крок
                "https://cdn.quotenova.net/images/authors/r/ray-kroc/ray-kroc-750x750.jpg",

                // Филл Найт
                "http://www.simplemost.com/wp-content/uploads/2018/11/814465464_Phil-Knight.jpg",

                // Томас Эдисон
                "https://uk-parkovaya.ru/wp-content/uploads/e/8/b/e8baaa723b05dbf15d8037d7744f5d1e.jpg",

                // Коко Шанель
                "https://ziva-club.ru/wp-content/uploads/2019/04/коко-шанель-4.jpg",

                // Марк Цукерберг
                "https://skolkolet.com/images/590e5ad27d66ac348e88bf0a/large@2x.jpg",

                // Уолт Дисней
                "https://i.pinimg.com/originals/f3/2c/c7/f32cc7e957fd3d92d13c19dc3e013e44.jpg",

                // Акио Морита
                "https://img-gorod.ru/upload/iblock/925/925a11d826d77e7bfdd59e6cb0d2d897.jpg",

                // Евгений Чичваркин
                "https://manulik.com/wp-content/uploads/2019/11/Чичваркин.jpg",

                // Опра Уинфри
                "https://uhd.name/uploads/posts/2020-11/1604607959_2-p-opra-uinfri-6.jpg",

                // Майкл Джордан
                "https://avatars.dzeninfra.ru/get-zen_doc/5042138/pub_6379f8519bf54d6982b32352_6379fad18963177bfc89053e/scale_1200",

                // Ричард Бренсон
                "https://com-business.ru/wp-content/uploads/a/0/b/a0b2ffeeabd3c6559d84dd132cb54523.jpeg",

                // Роберт Кийосаки
                "https://sun9-88.userapi.com/impf/PBe3BIcqVH8TPmFiidZ4eu4Lg_muh6nDiwLfYQ/2qgzrQj2Mjk.jpg?size=862x768&quality=96&sign=000f113456231dcce5a0b59f7f43e6a4&c_uniq_tag=9Chc7x_hNw44-1Sr1mfFaLIJYxuT16_YxNH9JWCvKyQ&type=album",

                // Уоррен Баффет
                "https://img.icotokenfund.com/img/entrepreneurs/587/5-things-we-learned-from-warren-buffett-annual-letter.jpg",

                // Стив Джобс
                "https://www.iphones.ru/wp-content/uploads/2015/06/steve-jobs-e1434470448366.jpg",

                // Стив Возняк
                "https://upload.wikimedia.org/wikipedia/commons/2/27/Steve_Wozniak_%2836998207703%29.jpg",

                // Генри Форд
                "https://interesnyefakty.org/wp-content/uploads/genri-ford-9.jpg",

                // Билл Гейтс
                "https://s.mediasole.ru/images/2886/2886540/1.jpg",

                // Маргарет Тэтчер
                "https://s.hdnux.com/photos/20/73/55/4438902/4/rawImage.jpg",

                // Ларри Эллисон
                "https://live.staticflickr.com/4149/5007504146_5e61a2e79d_b.jpg",

                // Амансио Ортега
                "https://interesnyefakty.org/wp-content/uploads/amansio-ortega-3.jpg",

                // Бернар Арно
                "https://mainstyles.ru/uploads/material-image/Jeff_Bezos_Bernard_Arnault_022_Mainstyle.jpg",

                // Стивен Кинг
                "https://hotgeo.ru/uploads/posts/2018-10/1540466039_sub-buzz-24545-1504735575-2.jpg",

                // Стивен Спилберг
                "https://zabavniki.club/wp-content/uploads/stiven_spilberg_foto_44_25112128.jpg",

                // Майкл Блумберг
                "https://nypost.com/wp-content/uploads/sites/2/2018/06/mike-bloomberg-takes.jpg?quality=75&amp;strip=all&amp;w=1024",

                // Джефф Безос
                "https://cloudfront-us-east-1.images.arcpublishing.com/infobae/S6RPYJ4FNQFSCJT25DAQXEKXQU.jpg",

                // Джек Ма
                "https://www.globalmsk.ru/usr/upload/upload-16347198400.jpg",

                // Стивен Хокинг
                "https://i.pinimg.com/736x/75/f3/ea/75f3eadfb7ac7e36df5bafca6c67381a.jpg",

                // Павел Дуров
                "https://www.iphones.ru/wp-content/uploads/2022/12/IMG-10983445-624a99e258c99.jpg",

                // Чжоу Цюньфей
                "https://bloganchoi.com/wp-content/uploads/2022/04/top-10-nu-ty-phu-tu-than-giau-nhat-the-gioi-zhou-qunfei.jpg",

                // Татьяна Бакальчук
                "https://biographe.ru/wp-content/uploads/2021/02/2424324.jpg",

                // Мадонна
                "https://i.pinimg.com/originals/89/c7/88/89c788ff313120e9487c9d4100dffe4a.jpg",

                // Карлос Слим Элу
                "https://interesnyefakty.org/wp-content/uploads/karlos-slim-elu-3.jpg",

                // Говард Шульц
                "https://trainings-consulting.ru/wp-content/uploads/2020/04/6-b6ae-86f731add19a.jpg",

                // Алексей Хлопков
                "https://ru-world.net/gallery/sun6-22.userapi.com/s/v1/ig2/ThpWqVClgpWbGbkDXKt9tZW9pDbCGt1VV9IYaDHrbeuEFx3pcvzgMQCqr5iCvKcKWfAfsY-muIilBjPzpkALQI-L.jpg?size=200x200&quality=95&crop=0,192,1920,1920&ava=1",

                // Иван Мурзин
                "https://avatars.githubusercontent.com/u/62932613?v=4",

                // Максим Садков
                "https://i.pinimg.com/originals/c7/0f/0f/c70f0f16f1629d638e8730f18c122567.jpg",

                // Даниил Покровский
                "https://i.imgur.com/iysd70Z.jpg",

                // Арсений Аношин
                "https://comicvine.gamespot.com/a/uploads/original/11130/111300127/5909677-luffyopener.jpg",

                // Александр Ошаров
                "https://a-static.besthdwallpaper.com/black-asta-demon-black-clover-wallpaper-2000x1333-71496_39.jpg"
        ));
    }

    /* метод для заполнения списка столбцов под именем whatDo */
    private void fillPersonsWhatDo() {
        personWhatDo.addAll(Arrays.asList(

                "Американский актёр, кинорежиссёр, сценарист и продюсер",
                "Основатель Samsung Group",
                "Основатель Honda Motor Co., Ltd.",

                "Основатель Toyota Motor Corporation.",
                "Основатель Википедии",
                "Основатель Yahoo",

                "Соснователь Google",
                "Соснователь Google",
                "Автор книг о Гарри Поттере",

                "Итальянский дизайнер, совладелец Дома моды Prada",
                "Основатель SpaceX, SolarCity, владелец Tesla",
                "Создательница компании Mary Kay Inc.",

                "Основатель Макдональдс",
                "Основатель Nike",
                "Великий изобретатель",

                "Французский модельер",
                "Основатель Facebook",
                "Основатель The Walt Disney Company",

                "Основатель Sony Corporation",
                "Сооснователь Евросети",
                "Известная телеведущая",

                "Легендарный баскетболист",
                "Основатель международной корпорации Virgin",
                "Известный финансовый консультант и инвестор",

                "Великий инвестор",
                "Сооснователь Apple",
                "Сооснователь Apple, создатель Apple I и Apple II",

                "Основатель Ford Motor Company",
                "Сооснователь Microsoft",
                "Премьер-министр Великобритании с 1979 по 1990",

                "Основатель Oracle",
                "Основатель и владелец Zara, Bershka, Pull&Bear, Stradivarius, Massimo Dutti",
                "Владелец торговых марок Christian Dior, Givenchy, Louis Vuitton, Hennessy",

                "Америкаский писатель. Король ужасов",
                "Самый кассовый кинорежиссер за всю историю кинематографа",
                "Основатель и СЕО информационного агентства «Bloomberg L.P.",

                "Основатель Amazon",
                "Сооснователь Alibaba Group",
                "Английский профессор, ученый, астрофизик и космолог",

                "Основатель Вконтакте и Telegram",
                "Основательница и генеральный директор компании Lens Technology",
                "Основательница интернет-магазина WildBerries.ru",

                "Известная певица, актриса, автор песен, певица и музыкальный продюсер",
                "Мексиканский бизнесмен",

                "Бывший CEO Starbucks",

                "С# - разработчик",

                "Flutter - разработчик, преподаватель IT школы Samsung",

                "Android - разработчик", "Android - разработчик",

                "Android - разработчик", "Android - разработчик"
        ));
    }

    /* метод для заполнения списка с предисловиями */
    private void fillPersonSummaries() {
        personSummaries.addAll(Arrays.asList(

                // 0
                "Звезда боевиков всех времён и народов. "
                        + "Прославился своими ролями боксёра Рокки Бальбоа и ветерана Вьетнамской войны Джона Рэмбо.\n"
                        + "Слай - это легенда! ",

                // 1
                "Ли Бён Чхоль — один из крупнейших бизнесменов в истории Кореи. "
                        + "Ли – человек, который превратил небольшой заводик по производству рисовой муки в огромную корпорацию с мировым именем. "
                        + "Давайте узнаем его историю",

                // 2
                "Соичиро Хонда — уникальный человек, прошедший тернистый путь от простого механика до владельца крупнейшего автомобильного бренда. "
                        + "Методом проб и ошибок этот целеустремленный японский изобретатель внес огромный вклад в автомобильную промышленность",

                // 3
                "У истоков автоимперии Toyota стоит Киичиро Тойода, талантливый инженер с императорскими наградам.\nЯ расскажу Вам об этом человеке",

                // 4
                "Джимми Уэйлс - создатель всемирно известной энциклопедии - Википедии."
                        + "Хотите узнать его историю?",

                // 5
                "Yahoo - предшественник Google. "
                        + "Хотите узнать историю разработчика этого поисковика?",

                // 6
                "Разработчик всемирно известной поисковой системы и один из руководителей крупнейшей it компании в мире."
                        + "Вам инересна его история?",

                // 7
                "Парень родом из СССР..."
                        + "Который стал одним из основателей невероятно успешной компании..."
                        + "Вам интересно, как так получилось?",

                // 8
                "Эта женщина написала 11 романов о мальчике волшебнике, который учится в таинственной школе магии. "
                        + "Вы наверняка читали хотя бы одну часть. "
                        + "Значит, Вам скорее всего интересна история этой легендарной писательницы."
                        + "Ведь так?",

                // 9
                "Ее называют провидицей в мире моды, хотя много лет она мечтала связать свою жизнь с политикой. "
                        + "Однако, возглавив семейный бизнес, Миучча Прада вознесла мир моды на совершенно новый уровень и стала одной из самых влиятельных женщин планеты",

                // 10
                "Человек - феномен. "
                        + "Он думает о космосе, экологии, технологиях. "
                        + "Он работает по 100 часов в неделю.\n"
                        + "Он - Илон Маск",

                // 11
                "В жизни Мэри Кэй ничего не доставалось легко. "
                        + "Никогда. На долю Мэри Кэй Эш пришлось столько боли, что ее хватило бы на многие жизни. "
                        + "Но она смогла разделить свою мечту с миллионами женщин...и достигла успеха",

                // 12
                "Каким образом 52 - летний комивояжер построил империю фастфуда с годовой прибылью более 700 миллионов долларов?\n"
                        + "Сейчас и узнаем!",

                // 13
                "О чем вам говорит слово Nike? О толстовке? О кроссовках? Лично у меня в голове всплывает Филл Найт - основатель компании Nike.\n"
                        + "Он приложил огромное количество усилий, чтобы Nike стала синонимом спортивной одежды.\n"
                        + "И у него все получилось",

                // 14
                "Кто изобрел лампу накаливания? Эдисон. Этот упорный и трудолюбивый изобретатель",

                // 15
                "\"Моду следует принимать, иначе вы будете выглядеть смешными. "
                        + "Однако принимать новое следует незаметно, маленькими порциями\". "
                        + "Так говорила одна из самых ярких и неоднозначно воспринимаемых женщин ХХ века Габриэль (Коко) Шанель",

                // 16
                "Молодой парень...разработавший самую известную социальную сеть в мире. "
                        + "Тот, кто обожал программировние...и создал нечто великое",

                // 17
                "Мультфильмы этого человека - наше детство!",

                // 18
                "Выдающийся изобретатель, создатель одной из ведущих компаний бытовой радиоэлектроники, для многих японцев он до самой смерти оставался мальчишкой, выскочкой и нарушителем корпоративных традиций.\n "
                        + "Но он навсегда вошел в историю!",

                // 19
                "Это человек, который мог продать все, что угодно. Настоящий предпринимательский талант!",

                // 20
                "Чуть ли не самая известная телеведущая в мире",

                // 21
                "Этот человек бросал вызов всем...\n"
                        + "Соперникам, судьбе... Дaже прохожим на улице..."
                        + "Он стал самым известным баскетболистом в мире",

                // 22
                "\"Бросая себе вызов, ты растешь, меняется твоя жизнь. Взгляд на мир становится жизнеутверждающим. "
                        + "Никогда не говори: \"сдаюсь\". Всегда повторяй: \"Я могу. Я буду пытаться, пока не добьюсь победы\" - Ричард Брэнсон",

                // 23
                "Роберт Кийосаки – известный предприниматель, писатель, инвестор, оратор-мотиватор.\n"
                        + "Основал частную образовательную компанию Rich Dad Company, которая занимается бизнес-образованием и обучает ведению личных финансов",

                // 24
                "Гений инвестирования, известный благотворительный деятель.\n"
                        + "И самый скромный миллиардер на планете",

                // 25
                "Знаете...\n"
                        + "О Джобсе можно гооврить вечно..."
                        + "Но я скажу одно..."
                        + "То, что поймут все..."
                        + "Хвала безумцам, одиночкам и бунтарям....",

                // 26
                "Инженер, собравший Apple I и Apple II.\n "
                        + "Человек, коорый жил и дышал программированием и инженерным делом",

                // 27
                "Сын ирландских эмигрантов, не окончивший ни одного технического образовательного учреждения, сумел построить автомобильную империю, стать лидером американского производства и сделать машины доступными для простого народа",

                // 28
                "На вашем компьютере стоит операционная система, которую выпустила компания этого человека."
                        + "Миллиардер, благотвоительный деятель, гений компьютерного мира - Билл Гейтс",

                // 29
                "Баронесса, премьер-министр Великобритании на протяжении 12 лет."
                        + "Она была первой женщиной, занявшей такой высокий пост, и первой, кто так долго находился в этом кресле",

                // 30
                "Кто может вести жизнь плейбоя, яхтсмена, гонщика и одновременно быть талантливым программистом, бизнесменом, руководителем одной из крупнейших IT-компаний?"
                        + "Только человек незаурядный, почти супергерой. "
                        + "Он - Ларри Эллисон",

                // 31
                "Не имевший возможности даже окончить среднюю школу, сегодня Ортега занимает шестое место в десятке самых богатых людей мира. "
                        + "Он известен созданием корпорации Inditex, под чьим крылом работают много фаст-фэшн брендов",

                // 32
                "Он известен как французский миллиардер, акула бизнеса и коллекционер мировых произведений искусства",

                // 33
                "Стивена Кинга часто называют «Королем ужасов», потому что в основном его произведения написаны в жанре хоррор. "
                        + "Его книги продаются миллионными тиражами и пользуются неизменным успехом у читателей разных поколений",

                // 34
                "Стивен Спилберг – знаменитый голливудский продюсер, режиссер и сценарист. "
                        + "Широкому кругу зрителей Спилберг известен по фильмам «Челюсти», «Инопланетянин», по франшизе «Индиана Джонс» и другим фильмам",

                // 35
                "Майкл Блумберг известен не только почётным девятым местом в списке Forbes, но и любовью к людям, своей стране и экологии. "
                        + "Аналитический склад ума помог ему трижды избираться на пост мэра Нью-Йорка",

                // 36
                "Джефф Безос – известный предприниматель, самый богатый человек в мире по версии издания Форбс. "
                        + "Основал и возглавляет интернет-компанию Amazon.com, аэрокосмическую компанию Blue origin, ему принадлежит издательский дом The Washington Post",

                // 37
                "Он с трудом закончил среднюю школу, 10 раз пытался поступить в Гарвард, его не приняли на работу в KFC, но несмотря на все шишки и удары судьбы, будущий основатель Alibaba Джек Ма шел напролом к своей цели и в итоге добился ее",

                // 38
                "Стивен Хокинг известен мировой общественности как физик-теоретик, писатель, космолог, автор научных изданий. "
                        + "Автор космологической теории, которая объединила общую теорию относительности и квантовую механику",

                // 37
                "Павел Дуров – известный предприниматель, программист. "
                        + "Стал одним из создателей популярной социальной сети «ВКонтакте» и мессенджера Telegram",

                // 38
                "Встречайте Чжоу Цюньфей, недоучку, бывшую работницу фабрики и основателя Lens Technologies – ведущего производителя сенсорных экранов для таких крупных заказчиков, как Apple и Samsung",

                // 39
                "Wildberries не нуждается в представлении — это крупнейший в России маркетплейс, потеснивший таких гигантов, как Ozon, Яндекс.Маркет и СберМегаМаркет. " +
                        "Давайте узнаем историю основательницы этого онлайн магазина",

                // 40
                "История жизни Мадонны доказывает, что при потрясающем трудолюбии можно осуществить стремительный взлет с низов до самой верхушки",

                // 41
                "Карлос Слим Элу - потрясающий бизнесмен, которому пришлось много раз падать и снова подниматься, чтобы достичь успеха",

                // 42
                "Бывший CEO Starbucks. Тот, кто сделал кофейни этой компании легендарными и запоминающимися",

                // 43
                "С# разработчик. "
                        + "Мой лучший друг!",

                // 44
                "Преподаватель it школы Samsung. "
                        + "Студент НИЯУ МИФИ...."
                        + "Человек, который научил меня любить свою работу..."
                        + "Лучший преподаватель информатики в моей жизни",

                // 45
                "Классный программист",

                // 46
                "Классный программист",

                // 47
                "Потрясающий разработчик. "
                        + "Я уверен, что наша битва станет легендарной",

                // 48
                "Один из лучших учеников it школы Samsung. "
                        + "Профессионал своего дела. "
                        + "Классный тимлид и очень креативный человек"
        ));
    }

    /* метод для заполнения списка с ссылками на полные биографии */
    private void fillPersonInfoLinks() {
        infoLinks.addAll(Arrays.asList(

                "https://myrouble.ru/sylvester-stallone-bio/",

                "https://myrouble.ru/bio-li-byon-chxolya/",

                "https://myrouble.ru/honda-soichiro-bio/",

                "https://myrouble.ru/kiichiro-tojoda-bio/",

                "https://myrouble.ru/jimmy-wales-bio/",

                "https://myrouble.ru/jerry-yang-bio/",

                "https://myrouble.ru/larry-page-bio/",

                "https://myrouble.ru/sergey-brin-bio/",

                "https://myrouble.ru/joanne-rowling-bio/",

                "https://myrouble.ru/miuccia-prada-bio/",

                "https://myrouble.ru/elon-musk-bio/",

                "https://myrouble.ru/mary-kay-bio/",

                "https://myrouble.ru/ray-kroc-bio/",

                "https://myrouble.ru/phil-knight-bio/",

                "https://myrouble.ru/thomas-edison-bio/",

                "https://myrouble.ru/bio-coco-chanel/",

                "https://myrouble.ru/mark-zuckerberg-bio/",

                "https://myrouble.ru/walt-disney-istoriya-uspexa/",

                "https://myrouble.ru/istoriya-uspexa-akio-morita/",

                "https://myrouble.ru/evgeniy-chichvarkin/",

                "https://myrouble.ru/bio-oprah-winfrey/",

                "https://myrouble.ru/michael-jordan-success-story/",

                "https://myrouble.ru/richard-brenson-virgin/",

                "https://myrouble.ru/robert-kiyosaki-bio-citaty/",

                "https://myrouble.ru/warren-buffett-biografiya/",

                "https://myrouble.ru/stive-jobs-biografiya-citaty/",

                "https://dzen.ru/a/YUmhPY5Z7Fw-Jem2", // Стив Возняк

                "https://myrouble.ru/genri-ford-istoriya-uspexa/",

                "https://myrouble.ru/bill-gejts-istoriya-uspexa-biografiya-citaty-pravila/",

                "https://myrouble.ru/margaret-thatcher-bio/",

                "https://myrouble.ru/larry-ellison-bio/",

                "https://myrouble.ru/amansio-ortega-bio/",

                "https://myrouble.ru/bernard-arnault-bio/",

                "https://myrouble.ru/stephen-king-bio/",

                "https://myrouble.ru/steven-spielberg-bio/",

                "https://myrouble.ru/michael-bloomberg-bio/",

                "https://myrouble.ru/jeff-bezos-bio/",

                "https://myrouble.ru/jack-ma-bio/",

                "https://myrouble.ru/stephen-hawking-bio/",

                "https://myrouble.ru/pavel-durov-bio/",

                "https://myrouble.ru/zhou-qunfei-bio/",

                "https://myrouble.ru/tatyany-bakalchuk-bio/",

                "https://myrouble.ru/madonna-biografiya-citaty-foto/",

                "https://myrouble.ru/karlos-slim-elu-samyj-bogatyj-chelovek-mira/",

                "https://vc.ru/trade/144920-starbaks-neveroyatnaya-istoriya-govarda-shulca",

                "отсутствует", "отсутствует",
                "отсутствует", "отсутствует",
                "отсутствует", "отсутствует"
        ));
    }

    /* метод для заполнения списка с ссылками на дополнительные источники */
    private void fillPersonDopLinks() {
        dopLinks.addAll(Arrays.asList(

                "https://www.youtube.com/watch?v=ev3Fq2q8i0I&t=129s", // Сильвестр Сталлоне

                "https://www.youtube.com/watch?v=5deFop7_ZrI", // История Samsung

                "https://www.youtube.com/watch?v=0ql1Lvz7a_o", // История Honda

                "https://www.youtube.com/watch?v=NfFE6DOYy9c", // История Toyota

                "https://vc.ru/flood/42020-dzhimmi-ueyls-terpet-neudachi-v-biznese-to-chto-mne-udaetsya-luchshe-vsego", // Википедия

                "https://dzen.ru/a/Y2BIpmry-gGJ6-M3", // Yahoo

                "https://www.youtube.com/watch?v=zwCHW_egUtc&t=1s", // История Google todo дважды

                "https://www.youtube.com/watch?v=zwCHW_egUtc&t=1s", // История Google todo дважды

                "https://www.youtube.com/watch?v=m4NXuVbAzQs", // История Джоан Роулинг

                "https://eva.ru/istorii-i-mneniya/odna-iz-samykh-vliyatel-nykh-i-bogatykh-zhenshchin-mira-perevernuvshaya-mir-mody-i-stavshaya-zakonodatel-nicej-novykh-veyanij--kto-takaya-miuchcha-prada",

                "https://www.youtube.com/watch?v=sZU6DoiTHmQ", // Принципы успеха Илона Маска

                "https://www.youtube.com/watch?v=52FlbG7Ro3I&t=261s", // История Мэри Кей Эш

                "https://dzen.ru/a/YE8dIq9Bo2ZBVICF", // История Рэя Крока

                "https://www.youtube.com/watch?v=b3m_DIKTJEo&t=621s", // История Nike

                "отсутствует", "отсутствует",

                "https://www.youtube.com/watch?v=-z6QOCoyR5s&t=2s",

                "отсутствует",

                "https://www.youtube.com/results?search_query=%D0%B8%D1%81%D1%82%D0%BE%D1%80%D0%B8%D1%8F+Sony", // история Sony

                "отсутствует", "отсутствует",

                "https://www.youtube.com/watch?v=LebKVOVthSc&t=582s", // История Майкла Джордана

                "отсутствует",

                "https://www.youtube.com/watch?v=yabcr6J-_rQ", // Роберт Кийосаки

                "отсутствует",

                "https://www.youtube.com/watch?v=AJsDONb_KdA&t=413s", // История Стива Джобса

                "https://www.youtube.com/watch?v=tBSO58JSBxA&t=756s", // История Стива Возняка

                "отсутствует",

                "https://www.youtube.com/watch?v=YgDE-d4pfTc&t=1721s", // Билл Гейтс

                "отсутствует", "отсутствует",

                "https://www.youtube.com/watch?v=eocepBKivb8&t=330s", // Амансио Ортега

                "отсутствует", "отсутствует",
                "отсутствует", "отсутствует",
                "отсутствует",

                "https://www.youtube.com/watch?v=vMJA7Zddacg&t=51s", // Джефф Безос

                "https://www.youtube.com/watch?v=w0Mc2CFxFyE", // Джек Ма

                "https://yandex.ru/search/?text=%D1%81%D1%82%D0%B8%D0%B2%D0%B5%D0%BD+%D1%85%D0%BE%D0%BE%D0%BA%D0%B8%D0%BD%D0%BD%D0%B3&clid=2313421-107&win=523&lr=213", // Стивен Хокинг

                "отсутствует", "отсутствует",
                "отсутствует", "отсутствует",
                "отсутствует",

                "https://www.youtube.com/watch?v=2pvE51S1wMg&t=5s", // Говард Шульц

                "отсутствует", "отсутствует",
                "отсутствует", "отсутствует",
                "отсутствует", "отсутствует"
        ));
    }

    /* метод для заполнения базы данных людьми */
    private void fillPersons() {
        for (int i = 0; i < personNames.size(); i++) {
            Person person = new Person(personNames.get(i),
                    personPhotos.get(i),
                    personWhatDo.get(i),
                    personSummaries.get(i),
                    infoLinks.get(i),
                    dopLinks.get(i));

            // добавляем человека
            persons.add(person);
        }
    }

    @Bean
    public CommandLineRunner commandLineRunner(PersonRepository personRepository) {

        // заполням списки составляющих сущности человеа
        fillPersonNames();
        fillPersonPhotos();
        fillPersonsWhatDo();
        fillPersonSummaries();
        fillPersonInfoLinks();
        fillPersonDopLinks();

        fillPersons(); // заполняем список людьми;

        return args -> {
            personRepository.saveAll(persons);
        };
    }
}