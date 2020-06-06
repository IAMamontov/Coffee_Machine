import java.util.Scanner

enum class CountryCurrency(val country: String, val currency: String) {
    GERMANY("Germany", "Euro"),
    MALI("Mali", "CFA franc"),
    DOMINICA("Dominica", "Eastern Caribbean dollar"),
    CANADA("Canada", "Canadian dollar"),
    SPAIN("Spain", "Euro"),
    AUSTRALIA("Australia", "Australian dollar"),
    BRAZIL("Brazil", "Brazilian real"),
    SENEGAL("Senegal", "CFA franc"),
    FRANCE("France", "Euro"),
    GRENADA("Grenada", "Eastern Caribbean dollar"),
    KIRIBATI("Kiribati", "Australian dollar"),
    NULL("", "");

    companion object {
        fun findByCountry(country: String): CountryCurrency {
            for (enum in CountryCurrency.values()) {
                if (country == enum.country) return enum
            }
            return NULL
        }
        fun isSameCurrency(country1: String, country2: String): Boolean {
            return CountryCurrency.findByCountry(country1).currency == CountryCurrency.findByCountry(country2).currency
        }
    }
}

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // put your code here
    val take1 = input.next()
    val take2 = input.next()
    print(CountryCurrency.isSameCurrency(take1, take2))
}
