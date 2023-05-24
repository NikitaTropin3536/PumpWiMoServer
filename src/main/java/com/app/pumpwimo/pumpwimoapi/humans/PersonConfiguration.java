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

                "Сильвестр Сталлоне", "  Ли Бён Чхоль", "Соичиро Хонда",

                "Киичиро Тойода", "Джимми Уэйлс", "Джерри Янг",

                "Ларри Пейдж", "Сергей Брин", "Джоан Роулинг",

                "Миучча Прада", "Илон Маск", "Мэри Кэй Эш",

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

                "Арсений Аношин", "Александр Ошаров",

                "Матвей Казуров", "Ешгин Магеррамов"
        ));
    }

    /* метод для заполнения списка с фотками */
    private void fillPersonPhotos() {
        personPhotos.addAll(Arrays.asList(

                // Сильвестр Сталлоне
                "https://almode.ru/uploads/posts/2021-04/1618122148_1-p-silvestr-stallone-1.jpg",

                // Ли Бён Чхоль
                "https://avatars.mds.yandex.net/i?id=d02b7c9898a3b8c036e49ee5a2956a18-4987739-images-thumbs&ref=rim&n=33&w=415&h=281",

                // Соичиро Хонда
                "https://avatars.dzeninfra.ru/get-zen_doc/1592246/pub_5eb4946d4ca89236df2d1555_5eb494ad9dbe95648c543b7f/scale_1200",

                // Киичиро Тойода
                "https://www.rewindandcapture.com/wp-content/uploads/2018/06/toyoda.jpg",

                // Джимми Уэйлс
                "https://upload.wikimedia.org/wikipedia/commons/3/39/Jimmy_Wales_by_Chris_Floyd.jpg",

                // Джерри Янг"
                "https://tse1.mm.bing.net/th/id/OIP.hgqf2Roc0VIZrevtve5PgwHaJ3?w=191&h=255&c=7&r=0&o=5&pid=1.7",

                // Ларри Пейдж
                "https://rb.ru/media/upload_tmp/lp17.jpg",

                // Сергей Брин
                "https://c400.ru/uploads/posts/2021-12/sergej-brin.png",

                // Джоан Роулинг
                "https://haipovo.ru/wp-content/uploads/2023/01/dzhoan-rouling-napishet-vosmuyu-knigu-o-garri-pottere.jpg",

                // Миучча Прада
                "https://i.pinimg.com/originals/6b/86/b4/6b86b42b6a416a024a96a692edc0a1d8.jpg",

                // Илон Маск
                "https://www.iphones.ru/wp-content/uploads/2022/07/220517095420-elon-musk-0502-restricted.jpg",

                // Мэри Кэй Эш
                "https://chaslaupiastsiuk.com/wp-content/uploads/2022/04/10e193959928ad2e42a0b9370d246e1f-2-1-scaled.jpeg",

                // Рэй Крок
                "https://fb.ru/misc/i/gallery/90445/2809627.jpg",

                // Филл Найт
                "https://i.insider.com/5bd9f145beb6703822204a54?width=2000&format=jpeg&auto=webp",

                // Томас Эдисон
                "https://uk-parkovaya.ru/wp-content/uploads/e/8/b/e8baaa723b05dbf15d8037d7744f5d1e.jpg",

                // Коко Шанель
                "https://webpulse.imgsmail.ru/imgpreview?key=pulse_cabinet-image-011cbd04-0a38-48ad-81d9-3263c60adc45&mb=webpulse",

                // Марк Цукерберг
                "https://s0.rbk.ru/v6_top_pics/media/img/1/70/755216957065701.jpg",

                // Уолт Дисней
                "https://img.joinfo.com/i/2022/02/800x0/6203a55776440.jpg",

                // Акио Морита
                "http://www.grandespymes.com.ar/wp-content/uploads/2015/11/akio-morita.32432dddc.jpg",

                // Евгений Чичваркин
                "https://avatars.mds.yandex.net/i?id=2ae14ca7343069418cc587dda54e2889ac83fa85-8496612-images-thumbs&n=13",

                // Опра Уинфри
                "https://vremax.com/wp-content/uploads/2022/12/img_63905c68425be.png",

                // Майкл Джордан
                "https://avatars.dzeninfra.ru/get-zen_doc/5042138/pub_6379f8519bf54d6982b32352_6379fad18963177bfc89053e/scale_1200",

                // Ричард Бренсон
                "https://com-business.ru/wp-content/uploads/a/0/b/a0b2ffeeabd3c6559d84dd132cb54523.jpeg",

                // Роберт Кийосаки
                "https://avatars.dzeninfra.ru/get-zen_doc/4909470/pub_63e34ee5e4f07234020d3009_63e34fd6e4f07234020f31d7/scale_1200",

                // Уоррен Баффет
                "https://img-s-msn-com.akamaized.net/tenant/amp/entityid/BB1ePS3r.img?w=1920&h=1080&m=4&q=84",

                // Стив Джобс
                "https://losko.ru/wp-content/uploads/2019/09/dzhobs_dzen.jpg",

                // Стив Возняк
                "https://upload.wikimedia.org/wikipedia/commons/2/27/Steve_Wozniak_%2836998207703%29.jpg",

                // Генри Форд
                "https://i.trbna.com/preset/wysiwyg/d/6a/8e2e8c04511e99f8bd76da6667122.jpeg",

                // Билл Гейтс
                "https://s.mediasole.ru/images/2886/2886540/1.jpg",

                // Маргарет Тэтчер
                "https://uhd.name/uploads/posts/2020-09/1600718684_28-p-margaret-tetcher-75.jpg",

                // Ларри Эллисон
                "https://avatars.mds.yandex.net/i?id=b52db865a47d8fdb6d260e4bfd4fe75a-4872471-images-thumbs&n=13",

                // Амансио Ортега
                "https://avatars.mds.yandex.net/i?id=4067447e9004d9bab499ff23ef28d7ab8a14e0af-5699445-images-thumbs&n=13",

                // Бернар Арно
                "https://s0.rbk.ru/v6_top_pics/media/img/1/11/755265443012111.jpg",

                // Стивен Кинг
                "https://sciencepop.ru/wp-content/uploads/2019/05/c4714ac5-c653-4171-8234-1b947be34a0d-scaled.jpg",

                // Стивен Спилберг
                "https://investvlg.ru/800/600/https/1079614922.rsc.cdn77.org/data/images/full/194545/steven-spielberg.jpg",

                // Майкл Блумберг
                "https://nypost.com/wp-content/uploads/sites/2/2018/06/mike-bloomberg-takes.jpg?quality=75&amp;strip=all&amp;w=1024",

                // Джефф Безос
                "https://cloudfront-us-east-1.images.arcpublishing.com/infobae/S6RPYJ4FNQFSCJT25DAQXEKXQU.jpg",

                // Джек Ма
                "https://s0.rbk.ru/v6_top_pics/media/img/2/75/756353392291752.jpg",

                // Стивен Хокинг
                "https://img.labirint.ru/images/goodssets/preview_img_1290_128.jpg",

                // Павел Дуров
                "https://www.iphones.ru/wp-content/uploads/2022/12/IMG-10983445-624a99e258c99.jpg",

                // Чжоу Цюньфей
                "https://bloganchoi.com/wp-content/uploads/2022/04/top-10-nu-ty-phu-tu-than-giau-nhat-the-gioi-zhou-qunfei.jpg",

                // Татьяна Бакальчук
                "https://biographe.ru/wp-content/uploads/2021/02/2424324.jpg",

                // Мадонна
                "https://stavropol-poisk.ru/wp-content/uploads/2020/05/131.jpg",

                // Карлос Слим Элу
                "https://interesnyefakty.org/wp-content/uploads/karlos-slim-elu-3.jpg",

                // Говард Шульц
                "https://trainings-consulting.ru/wp-content/uploads/2020/04/6-b6ae-86f731add19a.jpg",

                // Алексей Хлопков
                "https://wikimultia.org/images/0/09/Naruto_newshot.png?20180221230945",

                // Иван Мурзин
                "https://avatars.githubusercontent.com/u/62932613?v=4",

                // Максим Садков
                "https://i.pinimg.com/originals/c7/0f/0f/c70f0f16f1629d638e8730f18c122567.jpg",

                // Даниил Покровский
                "https://i.imgur.com/iysd70Z.jpg",

                // Арсений Аношин
                "https://i.pinimg.com/originals/3a/54/6a/3a546adb6b017141918d52faa5ef7bad.jpg",

                // Александр Ошаров
                "https://a-static.besthdwallpaper.com/black-asta-demon-black-clover-wallpaper-2000x1333-71496_39.jpg",

                // Матвей Казуров
                "https://flomaster.club/uploads/posts/2022-06/1655875222_51-flomaster-club-p-portret-koroleva-sergeya-pavlovicha-krasiv-57.jpg",

                // Ешгин Магеррамов
                "https://www.bolsamania.com/cine/wp-content/uploads/2021/12/1-14.jpg"
        ));
    }

    /* метод для заполнения списка столбцов под именем whatDo */
    private void fillPersonsWhatDo() {
        personWhatDo.addAll(Arrays.asList(

                "Американский актёр, кинорежиссёр и сценарист",
                "   Основатель \n Samsung Group",
                "Основатель \n Honda Motor Co., Ltd.",

                "   Основатель Toyota \n Motor Corporation",
                "   Основатель \n Википедии",
                "   Основатель \n Yahoo",

                "  Сооснователь \n Google",
                "  Сооснователь \n Google",
                "Автор книг о Гарри Поттере",

                "Cовладелец Дома \n моды Prada",
                "Основатель SpaceX, SolarCity, \n владелец Tesla",
                "Основательница \n Mary Kay Inc.",

                "Основатель Макдональдс",
                "  Основатель \n Nike",
                "  Великий \n изобретатель",

                "  Французский \n модельер",
                "  Основатель \n Facebook",
                "Основатель The Walt Disney Company",

                " Основатель Sony Corporation",
                "  Сооснователь \n Евросети",
                " Известная \n телеведущая",

                "Легендарный баскетболист",
                "Основатель международной корпорации Virgin",
                "Известный \n финансовый консультант",

                "  Великий \n инвестор",
                "  Сооснователь \n Apple",
                "Сооснователь Apple, создатель Apple I и Apple II",

                "  Основатель \n Ford Motor Company",
                "  Сооснователь \n Microsoft",
                "Премьер-министр Великобритании \n с 1979 по 1990",

                "  Основатель \n  Oracle",
                "  Основатель \n Inditex",
                "Владелец торговых марок Christian Dior, Louis Vuitton и др.",

                "Америкаский \n писатель. \n Король ужасов",
                "Известный кинорежиссер",
                "Основатель агентства Bloomberg L.P.",

                "  Основатель \n Amazon",
                "  Сооснователь \n Alibaba Group",
                "Английский \n астрофизик \n и космолог",

                "Основатель \n Вконтакте и Telegram",
                "  Основательница \n Lens Technology",
                "Основательница WildBerries.ru",

                "  Известная певица и актриса",
                "Мексиканский бизнесмен",

                "  Бывший \n CEO Starbucks",

                "С# - разработчик",

                "Flutter - разработчик, преподаватель IT школы Samsung",

                "Android - разработчик", "Android - разработчик",

                "Android - разработчик", "Android - разработчик",

                "Android - разработчик", "Python - разработчик"
        ));
    }

    /* метод для заполнения списка с предисловиями */
    private void fillPersonSummaries() {
        personSummaries.addAll(Arrays.asList(

                "Звезда боевиков всех времён и народов. "
                        + "Прославился своими ролями боксёра Рокки Бальбоа и ветерана Вьетнамской войны Джона Рэмбо.\n"
                        + "Слай - это легенда! ",

                "Ли Бён Чхоль — один из крупнейших бизнесменов в истории Кореи. "
                        + "Ли – человек, который превратил небольшой заводик по производству рисовой муки в огромную корпорацию с мировым именем. "
                        + "Давайте узнаем его историю",

                "Соичиро Хонда — уникальный человек, прошедший тернистый путь от простого механика до владельца крупнейшего автомобильного бренда. "
                        + "Методом проб и ошибок этот целеустремленный японский изобретатель внес огромный вклад в автомобильную промышленность",

                "У истоков автоимперии Toyota стоит Киичиро Тойода, талантливый инженер с императорскими наградам.\nЯ расскажу Вам об этом человеке",

                "Джимми Уэйлс - создатель всемирно известной энциклопедии - Википедии."
                        + "Хотите узнать его историю?",

                "Yahoo - предшественник Google. "
                        + "Хотите узнать историю разработчика этого поисковика?",

                "Разработчик всемирно известной поисковой системы и один из руководителей крупнейшей it компании в мире."
                        + "Вам инересна его история?",

                "Парень родом из СССР..."
                        + "Который стал одним из основателей невероятно успешной компании..."
                        + "Вам интересно, как так получилось?",

                "Эта женщина написала 11 романов о мальчике волшебнике, который учится в таинственной школе магии. "
                        + "Вы наверняка читали хотя бы одну часть. "
                        + "Значит, Вам скорее всего интересна история этой легендарной писательницы."
                        + "Ведь так?",

                "Ее называют провидицей в мире моды, хотя много лет она мечтала связать свою жизнь с политикой. "
                        + "Однако, возглавив семейный бизнес, Миучча Прада вознесла мир моды на совершенно новый уровень и стала одной из самых влиятельных женщин планеты",

                "Человек - феномен. "
                        + "Он думает о космосе, экологии, технологиях. "
                        + "Он работает по 100 часов в неделю.\n"
                        + "Он - Илон Маск",

                "В жизни Мэри Кэй ничего не доставалось легко. "
                        + "Никогда. На долю Мэри Кэй Эш пришлось столько боли, что ее хватило бы на многие жизни. "
                        + "Но она смогла разделить свою мечту с миллионами женщин...и достигла успеха",

                "Каким образом 52 - летний комивояжер построил империю фастфуда с годовой прибылью более 700 миллионов долларов?\n"
                        + "Сейчас и узнаем!",

                "О чем вам говорит слово Nike? О толстовке? О кроссовках? Лично у меня в голове всплывает Филл Найт - основатель компании Nike.\n"
                        + "Он приложил огромное количество усилий, чтобы Nike стала синонимом спортивной одежды.\n"
                        + "И у него все получилось",

                "Кто изобрел лампу накаливания? Эдисон. Этот упорный и трудолюбивый изобретатель",

                "\"Моду следует принимать, иначе вы будете выглядеть смешными. "
                        + "Однако принимать новое следует незаметно, маленькими порциями\". "
                        + "Так говорила одна из самых ярких и неоднозначно воспринимаемых женщин ХХ века Габриэль (Коко) Шанель",

                "Молодой парень...разработавший самую известную социальную сеть в мире. "
                        + "Тот, кто обожал программировние...и создал нечто великое",

                "Мультфильмы этого человека - наше детство!",

                "Выдающийся изобретатель, создатель одной из ведущих компаний бытовой радиоэлектроники, для многих японцев он до самой смерти оставался мальчишкой, выскочкой и нарушителем корпоративных традиций.\n "
                        + "Но он навсегда вошел в историю!",

                "Это человек, который мог продать все, что угодно. Настоящий предпринимательский талант!",

                "Чуть ли не самая известная телеведущая в мире",

                "Этот человек бросал вызов всем...\n"
                        + "Соперникам, судьбе... Дaже прохожим на улице..."
                        + "Он стал самым известным баскетболистом в мире",

                "\"Бросая себе вызов, ты растешь, меняется твоя жизнь. Взгляд на мир становится жизнеутверждающим. "
                        + "Никогда не говори: \"сдаюсь\". Всегда повторяй: \"Я могу. Я буду пытаться, пока не добьюсь победы\" - Ричард Брэнсон",

                "Роберт Кийосаки – известный предприниматель, писатель, инвестор, оратор-мотиватор.\n"
                        + "Основал частную образовательную компанию Rich Dad Company, которая занимается бизнес-образованием и обучает ведению личных финансов",

                "Гений инвестирования, известный благотворительный деятель.\n"
                        + "И самый скромный миллиардер на планете",

                "Знаете...\n"
                        + "О Джобсе можно гооврить вечно..."
                        + "Но я скажу одно..."
                        + "То, что поймут все..."
                        + "Хвала безумцам, одиночкам и бунтарям....",

                "Инженер, собравший Apple I и Apple II.\n "
                        + "Человек, коорый жил и дышал программированием и инженерным делом",

                "Сын ирландских эмигрантов, не окончивший ни одного технического образовательного учреждения, сумел построить автомобильную империю, стать лидером американского производства и сделать машины доступными для простого народа",

                "На вашем компьютере стоит операционная система, которую выпустила компания этого человека."
                        + "Миллиардер, благотвоительный деятель, гений компьютерного мира - Билл Гейтс",

                "Баронесса, премьер-министр Великобритании на протяжении 12 лет."
                        + "Она была первой женщиной, занявшей такой высокий пост, и первой, кто так долго находился в этом кресле",

                "Кто может вести жизнь плейбоя, яхтсмена, гонщика и одновременно быть талантливым программистом, бизнесменом, руководителем одной из крупнейших IT-компаний?"
                        + "Только человек незаурядный, почти супергерой. "
                        + "Он - Ларри Эллисон",

                "Не имевший возможности даже окончить среднюю школу, сегодня Ортега занимает шестое место в десятке самых богатых людей мира. "
                        + "Он известен созданием корпорации Inditex, под чьим крылом работают много фаст-фэшн брендов",

                "Он известен как французский миллиардер, акула бизнеса и коллекционер мировых произведений искусства",

                "Стивена Кинга часто называют «Королем ужасов», потому что в основном его произведения написаны в жанре хоррор. "
                        + "Его книги продаются миллионными тиражами и пользуются неизменным успехом у читателей разных поколений",

                "Стивен Спилберг – знаменитый голливудский продюсер, режиссер и сценарист. "
                        + "Широкому кругу зрителей Спилберг известен по фильмам «Челюсти», «Инопланетянин», по франшизе «Индиана Джонс» и другим фильмам",

                "Майкл Блумберг известен не только почётным девятым местом в списке Forbes, но и любовью к людям, своей стране и экологии. "
                        + "Аналитический склад ума помог ему трижды избираться на пост мэра Нью-Йорка",

                "Джефф Безос – известный предприниматель, самый богатый человек в мире по версии издания Форбс. "
                        + "Основал и возглавляет интернет-компанию Amazon.com, аэрокосмическую компанию Blue origin, ему принадлежит издательский дом The Washington Post",

                "Он с трудом закончил среднюю школу, 10 раз пытался поступить в Гарвард, его не приняли на работу в KFC, но несмотря на все шишки и удары судьбы, будущий основатель Alibaba Джек Ма шел напролом к своей цели и в итоге добился ее",

                "Стивен Хокинг известен мировой общественности как физик-теоретик, писатель, космолог, автор научных изданий. "
                        + "Автор космологической теории, которая объединила общую теорию относительности и квантовую механику",

                "Павел Дуров – известный предприниматель, программист. "
                        + "Стал одним из создателей популярной социальной сети «ВКонтакте» и мессенджера Telegram",

                "Встречайте Чжоу Цюньфей, недоучку, бывшую работницу фабрики и основателя Lens Technologies – ведущего производителя сенсорных экранов для таких крупных заказчиков, как Apple и Samsung",

                "Wildberries не нуждается в представлении — это крупнейший в России маркетплейс, потеснивший таких гигантов, как Ozon, Яндекс.Маркет и СберМегаМаркет. " +
                        "Давайте узнаем историю основательницы этого онлайн магазина",

                "История жизни Мадонны доказывает, что при потрясающем трудолюбии можно осуществить стремительный взлет с низов до самой верхушки",

                "Карлос Слим Элу - потрясающий бизнесмен, которому пришлось много раз падать и снова подниматься, чтобы достичь успеха",

                "Бывший CEO Starbucks. Тот, кто сделал кофейни этой компании легендарными и запоминающимися",

                "С# разработчик. "
                        + "Мой лучший друг!",

                "Преподаватель it школы Samsung. "
                        + "Студент НИЯУ МИФИ...."
                        + "Человек, который научил меня любить свою работу..."
                        + "Лучший преподаватель информатики в моей жизни",

                "Классный программист",

                "Классный программист",

                "Потрясающий разработчик. "
                        + "Я уверен, что наша битва станет легендарной",

                "Один из лучших учеников it школы Samsung. "
                        + "Профессионал своего дела. "
                        + "Классный тимлид и очень креативный человек",

                "Разработчик приложения ShareHelp",

                "Ешгин"
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

                // todo содержание этого видео соответствует содержанию биографии - плохо!!
                "https://www.youtube.com/watch?v=2pvE51S1wMg&t=5s", // Говард Шульц

                "отсутствует", "отсутствует",
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