import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*

@Composable
fun Child(store: Store){
    Button(onClick = {
        store.count.value++
    }) {
        Text(store.count.value.toString())
    }
}