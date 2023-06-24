package com.rajnish.firstcompose.screen.auth


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun LoginScreen(

) {
    val value  = remember {
        mutableStateOf("")
    }

    Surface(
        Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "Hey There",
                textAlign = TextAlign.Center,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 10.dp)
            )
            Text(
                text = value.value,
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(10.dp)
            )
            EditText("Name", value = value)
            EditText("LastName", value =value)
            EditText("Email", value =value)
            EditText("Create Password", value =value)
            EditText("Conform Password", value = value)
            CustomCheckBox()
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                onClick = { /*TODO*/ }
            ) {
                Text(text = "Register")
            }

            MyDivider()
            ClickableLoginTextComponent(onTextSelected = {

            })
        }


    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditText(label: String, value: MutableState<String>) {

    OutlinedTextField(
        value = value.value,

        onValueChange = {
           value.value = it
        },
        label = { Text(text =  label)},
        modifier = Modifier
            .fillMaxWidth(1f)
            .padding(top = 8.dp),
    )


}

@Composable
fun CustomCheckBox() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp, 10.dp)
    ) {
        Checkbox(checked = false, onCheckedChange = {})
        Text(
            text = "By using this you are agree to our \nterms and policy",
            textAlign = TextAlign.Start,
            fontSize = 14.sp,


            )

    }
}


@Composable
fun MyDivider() {

    Row(verticalAlignment = Alignment.CenterVertically) {
        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            color = Color.Gray,
            thickness = 1.dp
        )
        Text(text = "Or", modifier = Modifier.padding(8.dp), fontSize = 18.sp)
        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            color = Color.Gray,
            thickness = 1.dp
        )
    }


}


@Composable
fun ClickableLoginTextComponent(onTextSelected:(String) -> Unit) {
    val initialText = " Already Have  an account? "
    val loginText = "Login"
    val annotatedString = buildAnnotatedString {
        append(initialText)
        withStyle(style = SpanStyle(color = Color.Magenta)) {
            pushStringAnnotation(tag = loginText, annotation = loginText)
            append(loginText)
        }
    }
    ClickableText(text = annotatedString, onClick = {offset ->
     annotatedString.getStringAnnotations(offset, offset)
         .firstOrNull()?.also {span ->
             if(span.item == loginText){
            onTextSelected(span.item)
             }
         }
    })

}

@Preview
@Composable
fun LoginPreview() {
    LoginScreen()
}