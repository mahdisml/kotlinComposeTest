import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*

@Composable
fun Child(store: Store){
    Button(onClick = {
        store.count++
    }) {
        Text(store.count.toString())
    }
}