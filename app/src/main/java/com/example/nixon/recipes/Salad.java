package com.example.nixon.recipes;

public class Salad {
    private String name;
    private String description;
    private int imageResourseId;

    private Salad(String name, String description, int imageResourseId) {
        this.name = name;
        this.description = description;
        this.imageResourseId = imageResourseId;
    }

    public static final Salad[] salads = {
            new Salad("Крабовый салат с яблоком", "Ингредиенты:\n" +
                    "100 гр. крабовых палочек;\n" +
                    "100 гр. яблок;\n" +
                    "100 гр. креветок;\n" +
                    "100 гр. свежих огурцов;\n" +
                    "1 куриное яйцо;\n" +
                    "майонез и соль — по вкусу.\n\n" +
                    "Рецепт приготовления:\n" +
                    "Вкрутую сварите куриное яйцо, затем остудите его и очистите от скорлупы.\n" +
                    "Яблоки с огурцами очистите от кожицы.\n" +
                    "Креветки отварите в подсоленной воде, затем остудите. Несколько штук отложите для украшения салата.\n" +
                    "Далее берете очищенные яблоки, огурцы, отварные креветки, куриное яйцо, крабовые палочки и все это нарезаете кубиками.\n" +
                    "А теперь просто смешайте все измельченные выше ингредиенты в салатнике. Немного посолите и заправьте салатик майонезом. Сверху украсьте его несколькими целыми креветками и листьями салата.", R.drawable.krab_salat),
            new Salad("Винегрет с квашеной капустой", "Ингредиенты:\n" +
                    "2-3 картофелины;\n" +
                    "1-2 морковки;\n" +
                    "100-150 гр. квашенной капусты;\n" +
                    "1 свекла;\n" +
                    "1 репчатый лук;\n" +
                    "2-3 средних соленых огурца;\n" +
                    "масло растительное;\n" +
                    "соль и зеленый лук — по вкусу.\n\n" +
                    "Рецепт приготовления:\n" +
                    "Свеклу, морковь и картошку хорошенько вымойте, а затем сложите в кастрюлю, залейте водой и отварите до мягкости.\n" +
                    "После вареные овощи очистите от кожицы и нарежьте маленькими кубиками. Лук репчатый очистите и мелко нашинкуйте. Соленые огурцы порежьте кубиками. Квашеную капусту немного отожмите от рассола. Примечание! Чтобы свекла не окрасила остальные овощи в салате, ее нужно сначала отдельно перемешать с растительным маслом.\n" +
                    "Смешайте вместе – вместе картошку, морковку, лук, капусту и огурцы. Заправьте салат маслом. А теперь добавьте свеклу, а также по вкусу соль и все тщательно перемешайте.\n", R.drawable.vinegret)
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
