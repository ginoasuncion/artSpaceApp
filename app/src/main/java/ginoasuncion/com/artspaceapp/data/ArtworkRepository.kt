package ginoasuncion.com.artspaceapp.data

import ginoasuncion.com.artspaceapp.R

object ArtworkRepository {
    fun getArtworks() = listOf(
        Artwork(
            titleRes = R.string.girl_with_a_pearl_earring,
            artistRes = R.string.artist_vermeer,
            imageRes = R.drawable.girl_with_a_pearl_earring_by_johannes_vermeer_1665_800x_jpg
        ),
        Artwork(
            titleRes = R.string.impression_sunrise,
            artistRes = R.string.artist_monet,
            imageRes = R.drawable.impression_sunrise_by_claude_monet_1872_800x
        ),
        Artwork(
            titleRes = R.string.mona_lisa,
            artistRes = R.string.artist_da_vinci,
            imageRes = R.drawable.mona_liza_800x
        ),
        Artwork(
            titleRes = R.string.souvenir_from_havre,
            artistRes = R.string.artist_picasso,
            imageRes = R.drawable.souvenir_from_havre_picasso_1648576524060_800x_jpg
        ),
        Artwork(
            titleRes = R.string.great_wave_of_kanagawa,
            artistRes = R.string.artist_hokusai,
            imageRes = R.drawable.the_great_wave_of_kanagawa_by_katsushika_hokusai_1831_800x_jpg
        ),
        Artwork(
            titleRes = R.string.last_supper,
            artistRes = R.string.artist_da_vinci_last_supper,
            imageRes = R.drawable.the_last_supper_by_leonardo_da_vinci_1495_1498_800x
        ),
        Artwork(
            titleRes = R.string.the_scream,
            artistRes = R.string.artist_munch,
            imageRes = R.drawable.the_scream_by_edvard_munch_1893_800x_png
        ),
        Artwork(
            titleRes = R.string.starry_night,
            artistRes = R.string.artist_van_gogh,
            imageRes = R.drawable.the_starry_night_by_vincent_van_gogh_1889_800x
        )
    )
}

data class Artwork(
    val titleRes: Int,
    val artistRes: Int,
    val imageRes: Int
)
