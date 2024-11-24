package ginoasuncion.com.artspaceapp

import androidx.compose.foundation.layout.size
import androidx.lifecycle.ViewModel
import ginoasuncion.com.artspaceapp.data.ArtworkRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MainViewModel : ViewModel() {

    private val artworks = ArtworkRepository.getArtworks()

    private val _currentIndex = MutableStateFlow(0)
    val currentIndex: StateFlow<Int> = _currentIndex

    fun getCurrentArtwork() = artworks[_currentIndex.value]

    fun previousArtwork() {
        if (_currentIndex.value > 0) {
            _currentIndex.value--
        }
    }

    fun nextArtwork() {
        if (_currentIndex.value < artworks.size - 1) {
            _currentIndex.value++
        }
    }

    fun getTotalArtworks(): Int = ArtworkRepository.getArtworks().size

}
