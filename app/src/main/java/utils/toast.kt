package utils

import android.app.Activity
import android.view.Gravity
import android.widget.TextView
import android.widget.Toast
import com.example.challangesfour.R

fun Toast.showCustomToast(message: String, activity: Activity)
{
    val layout = activity.layoutInflater.inflate (
        R.layout.toast_custom,
        activity.findViewById(R.id.toast_container)
    )

    // set the text of the TextView of the message
    val textView = layout.findViewById<TextView>(R.id.tv_toast)
    textView.text = message

    // use the application extension function
    this.apply {
        setGravity(Gravity.BOTTOM, 0, 40)
        duration = Toast.LENGTH_LONG
        view = layout
        show()
    }
}