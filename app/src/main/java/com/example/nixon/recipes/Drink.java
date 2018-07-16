package com.example.nixon.recipes;

public class Drink {
    private String name;
    private String description;
    private int imageResourseId;

    private Drink(String name, String description, int imageResourseId) {
        this.name = name;
        this.description = description;
        this.imageResourseId = imageResourseId;
    }

    public static final Drink[] drinks = {
            new Drink("Быстрый лимонад", "Ингредиенты:\n" +
                    "Лимон 2 штуки\n" +
                    "Сахар 200 г\n" +
                    "Вода 750 мл\n" +
                    "Лед 6 штук\n\n" +
                    "Рецепт приготовления:\n" +
                    "1. Хорошо помыть лимоны.\n" +

            "2. Разрезать лимоны и положить в блендер\n" +

            "3. Добавить сахар, холодную воду и лед\n" +

            "4. Перемешивать 1 минуту\n" +

            "5. Процедить через мелкое сито\n" +

            "6. Украсить дольками лимона", R.drawable.limonade),
            new Drink("Горячий шоколад", "Ингредиенты:\n" +
                    "Молоко 500 мл\n" +
                    "Кукурузная мука 1 чайная ложка\n" +
                    "Черный шоколад 70% 120 г\n" +
                    "Сахар по вкусу\n\n" +
                    "Рецепт приготовления:\n" +
                    "1. Подогреть молоко на среднем огне до робкого кипения, сделать огонь совсем минимальным и всыпать в кастрюльку с молоком наломанный маленькими кусочками шоколад (шоколад перед этим лучше на пару часов положить в морозилку: после холода он дает более тонкий вкус). Помешивая содержимое кастрюльки, довести напиток до однородного состояния и робкого, с побулькиванием кипения.\n" +

            "2. Добавить сахару и загустить кукурузной мукой. Чтобы она не сбивалась в комки, нелишне предварительно капнуть в столовую ложку с мукой немного горячей жидкости, превратить содержимое ложки в кашицу и уже потом при помощи этой кашицы загущать остальной шоколад.\n" +

            "3. Разлить готовый шоколад по чашкам и немедленно подавать.", R.drawable.hot_choko),
            new Drink("Компот из замороженных ягод", "Ингредиенты:\n" +
                    "Замороженные ягоды 500 г\n" +
                    "Вода 2 л\n" +
                    "Сахар 1 стакан\n\n" +
                    "Рецепт приготовления:\n" +
                    "1. В кастрюлю объемом 5 литров (можно меньше) вливаем воду и добавляем сахар. Доводим до кипения.\n" +

            "2. Замороженные ягоды отправляем в кипящую воду и снова ждем, пока вода закипит и уменьшаем огонь.\n" +

            "3. Варим компот на маленькой температуре около 5 минут, после чего закрываем крышкой и оставляем в стороне на 30 минут.\n" +

            "4. Остужаем, при желании можно процедить.", R.drawable.fruit)
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageResourseId() {
        return imageResourseId;
    }

    public void setImageResourseId(int imageResourseId) {
        this.imageResourseId = imageResourseId;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
