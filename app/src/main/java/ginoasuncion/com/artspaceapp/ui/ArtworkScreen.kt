package ginoasuncion.com.artspaceapp.ui

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ginoasuncion.com.artspaceapp.MainViewModel
import ginoasuncion.com.artspaceapp.R

@Composable
fun ArtworkScreen(viewModel: MainViewModel) {
    val currentIndex by viewModel.currentIndex.collectAsState()
    val currentArtwork = viewModel.getCurrentArtwork()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Artwork Image
            Image(
                painter = painterResource(id = currentArtwork.imageRes),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(4f / 2f)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Artwork Title
            Text(
                text = stringResource(currentArtwork.titleRes),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            // Artist Name
            Text(
                text = stringResource(currentArtwork.artistRes),
                fontSize = 18.sp,
                color = Color.Gray
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Buttons Row
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Button(
                    onClick = { viewModel.previousArtwork() },
                    enabled = currentIndex > 0,
                    modifier = Modifier.padding(end = 8.dp)
                ) {
                    Text(
                        text = stringResource(R.string.previous_button),
                        fontSize = 18.sp
                    )
                }
                Button(
                    onClick = { viewModel.nextArtwork() },
                    enabled = currentIndex < viewModel.getTotalArtworks() - 1,
                    modifier = Modifier.padding(start = 8.dp)
                ) {
                    Text(
                        text = stringResource(R.string.next_button),
                        fontSize = 18.sp
                    )
                }
            }
        }
    }
}
