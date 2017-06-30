using System;
using System.Collections.Generic;
using System.Text;
using Xamarin.Forms;
using Xamarin.Android;
using Android.Content;
using System.Windows;
using Com.Tooltip;

namespace XFApp1
{
    class SimpleContentPage:ContentPage
    {
        public SimpleContentPage()
        {
            //BackgroundColor = Color.Black;

            double a_ = 0, b_ = 0, count=0;

            var entry1 = new Entry
            {
               IsEnabled = false,
               
               //BackgroundColor = Color.Black,
                //InputTransparent = false
            };

            var tooltipButton = new Button {
                Text = "PRESS TO SEE INFO",
                Font = Font.SystemFontOfSize(NamedSize.Micro),
                TextColor = Color.WhiteSmoke,
                HorizontalOptions = LayoutOptions.Center,
                VerticalOptions = LayoutOptions.EndAndExpand
            };

            tooltipButton.Clicked += (sender, e) =>{
                DisplayAlert("", "by ilkod", "close");
            };



            
            // entry1.Margin = new Thickness(0,0,0,0);

            
            

            var button1 = new Button
            {
                Text = "1",
                
            };

            var button2 = new Button
            {
                Text = "2",
            };

            var button3 = new Button
            {
                Text = "3",

            };

            var button4 = new Button
            {
                Text = "4",

            };

            var button5 = new Button
            {
                Text = "5",
            };

            var button6 = new Button
            {
                Text = "6",

            };

            var button7 = new Button
            {
                Text = "7",

            };

            var button8 = new Button
            {
                Text = "8",
            };

            var button9 = new Button
            {
                Text = "9",

            };

            var button0 = new Button
            {
                Text = "0",

            };

            var buttonPlus = new Button
            {
                Text = "+",
            };

            var buttonMinus = new Button
            {
                Text = "-",
              //  BackgroundColor = Color.Black,
               // BorderColor=Color.Gray
            };

            var buttonMult = new Button
            {
                Text = "×",

            };

            var buttonDivide = new Button
            {
                Text = "÷",
            };

            var buttonErase = new Button
            {
                Text = "c",
                TextColor = Color.DarkOrange
            };

            var buttonEquals = new Button
            {
                Text = "=",

            };

            var buttonDot = new Button
            {
                Text = ".",

            };



            var grid = new Grid (){

                RowDefinitions = {
                    new RowDefinition {Height = new GridLength(1, GridUnitType.Star) },
                    new RowDefinition {Height = new GridLength(1, GridUnitType.Star) },
                    new RowDefinition {Height = new GridLength(1, GridUnitType.Star) },
                    new RowDefinition {Height = new GridLength(1, GridUnitType.Star) },
                    new RowDefinition {Height = new GridLength(1, GridUnitType.Star) },
                },

                ColumnDefinitions = {
                    new ColumnDefinition{Width = new GridLength(1, GridUnitType.Star) },
                    new ColumnDefinition{Width = new GridLength(1, GridUnitType.Star) },
                    new ColumnDefinition{Width = new GridLength(1, GridUnitType.Star) },
                    new ColumnDefinition{Width = new GridLength(1, GridUnitType.Star) },
                }

            };

            //grid.Padding = new Thickness(0, 150, 0, 0);

            grid.Children.Add(button1, 0, 0);
            grid.Children.Add(button2, 1, 0);
            grid.Children.Add(button3, 2, 0);
            grid.Children.Add(buttonPlus, 3, 0);

            grid.Children.Add(button4, 0, 1);
            grid.Children.Add(button5, 1, 1);
            grid.Children.Add(button6, 2, 1);
            grid.Children.Add(buttonMinus, 3, 1);

            grid.Children.Add(button7, 0, 2);
            grid.Children.Add(button8, 1, 2);
            grid.Children.Add(button9, 2, 2);
            grid.Children.Add(buttonMult, 3, 2);

            grid.Children.Add(button0, 0, 3);
            grid.Children.Add(buttonDot, 1, 3);
            grid.Children.Add(buttonErase, 2, 3);
            grid.Children.Add(buttonDivide, 3, 3);

            grid.Children.Add(buttonEquals, 0, 4);
            Grid.SetColumnSpan(buttonEquals, 4);


            button1.Clicked += (sender, e) => {
                entry1.Text += "1";
            };

            button2.Clicked += (sender, e) => {
                entry1.Text += "2";
            };

            button3.Clicked += (sender, e) => {
                entry1.Text += "3";
            };

            button4.Clicked += (sender, e) => {
                entry1.Text += "4";
            };

            button5.Clicked += (sender, e) => {
                entry1.Text += "5";
            };

            button6.Clicked += (sender, e) => {
                entry1.Text += "6";
            };

            button7.Clicked += (sender, e) => {
                entry1.Text += "7";
            };

            button8.Clicked += (sender, e) => {
                entry1.Text += "8";
            };

            button9.Clicked += (sender, e) => {
                entry1.Text += "9";
            };

            button0.Clicked += (sender, e) => {
                entry1.Text += "0";
            };

            buttonDot.Clicked += (sender, e) =>
            {
                if (!Dots_Contatin(entry1.Text))
                { entry1.Text += "."; }
                else { entry1.Text += ""; }
            };

            buttonErase.Clicked += (sender, e) => {
                entry1.Text = "";
            };

            buttonPlus.Clicked += (sender, e) => {
                a_ = Convert.ToDouble(entry1.Text);
                count = 1;
                entry1.Text = "";
            };

            buttonMinus.Clicked += (sender, e) => {
                a_ = Convert.ToDouble(entry1.Text);
                count = 2;
                entry1.Text = "";
            };

            buttonMult.Clicked += (sender, e) => {
                a_ = Convert.ToDouble(entry1.Text);
                count = 3;
                entry1.Text = "";
            };

            buttonDivide.Clicked += (sender, e) => {
                a_ = Convert.ToDouble(entry1.Text);
                count = 4;
                entry1.Text = "";
            };

            buttonEquals.Clicked += (sender, e) => {
                switch (count)
                {
                    case 1:
                        b_ = sum(a_, Convert.ToDouble(entry1.Text));
                        entry1.Text = b_.ToString();
                        break;
                    case 2:
                        b_ = min(a_, Convert.ToDouble(entry1.Text));
                        entry1.Text = b_.ToString();
                        break;
                    case 3:
                        b_ = mlt(a_, Convert.ToDouble(entry1.Text));
                        entry1.Text = b_.ToString();
                        break;
                    case 4:
                        if (Convert.ToDouble(entry1.Text) == 0)
                        {
                            a_ = 0;
                            b_ = 0;
                            count = 0;
                            entry1.Text = "";
                        }
                        else
                        {
                            b_ = div(a_, Convert.ToDouble(entry1.Text));
                            entry1.Text = b_.ToString();
                        }
                        break;

                    default:
                        entry1.Text += "";
                        break;
                }
            };

            Content = new StackLayout
            {
                //Padding = 30,
                Spacing = 10,
                Children = { entry1, grid, tooltipButton }//label1, entry1, button1, button2, button3, button4}
            };

             bool Dots_Contatin(string s)
            {
                foreach (char a in s)
                {
                    if (a.Equals('.'))
                    { return true; }
                }
                return false;
            }

            double sum(double a, double b) { return a + b; }

            double min(double a, double b) { return a - b; }

            double mlt(double a, double b) { return a * b; }

            double div(double a, double b) { return a / b; }
        }


        public async void ttBtn_Clicked(Object sender, EventArgs e) {
        }
}
    
}
