package eu.kanade.tachiyomi.extension.es.tumangasnet

import eu.kanade.tachiyomi.source.model.Filter

class GenreFilter() : UriPartFilter(
    "Género",
    arrayOf(
        Pair("Acción", "accion"),
        Pair("Aventura", "aventura"),
        Pair("Comedia", "comedia"),
        Pair("Drama", "drama"),
        Pair("Recuentos de la vida", "recuentos-de-la-vida"),
        Pair("Ecchi", "ecchi"),
        Pair("Fantasia", "fantasia"),
        Pair("Magia", "magia"),
        Pair("Sobrenatural", "sobrenatural"),
        Pair("Horror", "horror"),
        Pair("Misterio", "misterio"),
        Pair("Psicológico", "psicologico"),
        Pair("Romance", "romance"),
        Pair("Ciencia Ficción", "ciencia-ficcion"),
        Pair("Thriller", "thriller"),
        Pair("Deporte", "deporte"),
        Pair("Girls Love", "girls-love"),
        Pair("Boys Love", "boys-love"),
        Pair("Harem", "harem"),
        Pair("Mecha", "mecha"),
        Pair("Supervivencia", "supervivencia"),
        Pair("Reencarnación", "reencarnacion"),
        Pair("Gore", "gore"),
        Pair("Apocalíptico", "apocaliptico"),
        Pair("Tragedia", "tragedia"),
        Pair("Vida Escolar", "vida-escolar"),
        Pair("Historia", "historia"),
        Pair("Militar", "militar"),
        Pair("Policiaco", "policiaco"),
        Pair("Crimen", "crimen"),
        Pair("Superpoderes", "superpoderes"),
        Pair("Vampiros", "vampiros"),
        Pair("Artes Marciales", "artes-marciales"),
        Pair("Samurái", "samurai"),
        Pair("Género Bender", "genero-bender"),
        Pair("Realidad Virtual", "realidad-virtual"),
        Pair("Ciberpunk", "ciberpunk"),
        Pair("Musica", "musica"),
        Pair("Parodia", "parodia"),
        Pair("Animación", "animacion"),
        Pair("Demonios", "demonios"),
        Pair("Familia", "familia"),
        Pair("Extranjero", "extranjero"),
        Pair("Niños", "ninos"),
        Pair("Realidad", "realidad"),
        Pair("Telenovela", "telenovela"),
        Pair("Guerra", "guerra"),
        Pair("Oeste", "oeste"),
    ),
)

open class UriPartFilter(displayName: String, val vals: Array<Pair<String, String>>) :
    Filter.Select<String>(displayName, vals.map { it.first }.toTypedArray()) {
    fun toUriPart() = vals[state].second
}
