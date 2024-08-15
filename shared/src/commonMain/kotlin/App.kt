import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.handsignals.service.network.NetworkService
import org.koin.compose.KoinContext
import org.koin.compose.koinInject

@Composable
fun ComposeView() {
    KoinContext {
        val ns: NetworkService = koinInject()
        Box(modifier = Modifier.fillMaxSize(), Alignment.Center) {
            Text("TODO($ns) Place stuff here", fontSize = 48.sp)
        }
    }
}
