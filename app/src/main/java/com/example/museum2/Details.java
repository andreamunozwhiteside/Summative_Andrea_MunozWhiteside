package com.example.museum2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Details extends AppCompatActivity {
    int price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Intent intent = getIntent();
        String selectedmuseum = intent.getStringExtra("selectedMuseum");
        //displays details of museum
        setDetail(selectedmuseum);
    }

        void setDetail (String s){
            switch(s){
                case "Louvre":
                    ((ImageView)findViewById(R.id.museumImg)).setImageResource(R.drawable.louvre);

                    ((TextView)findViewById(R.id.detailTxt)).setText(
                            "The Louvre is the world's largest art museum and a historic monument in Paris, France, and is best known for being the home of the Mona Lisa. A central landmark of the city, it is located on the Right Bank of the Seine in the city's 1st arrondissement (district or ward). Approximately 38,000 objects from prehistory to the 21st century are exhibited over an area of 72,735 square meters (782,910 square feet). Due to the COVID-19 pandemic, the museum was closed for 150 days in 2020, and attendance plunged by 72 percent to 2.7 million. Nonetheless, the Louvre still topped the list of most-visited art museums in the world in 2020."
                    );
                    price = 10;
                    break;
                case "National Museum of China":
                    ((ImageView)findViewById(R.id.museumImg)).setImageResource(R.drawable.china);

                    ((TextView)findViewById(R.id.detailTxt)).setText(
                            "The National Museum of China (Chinese: 中国国家博物馆; pinyin: Zhōngguó Guójiā Bówùguǎn) flanks the eastern side of Tiananmen Square in Beijing, China. The museum's mission is to educate about the arts and history of China. It is directed by the Ministry of Culture of the People's Republic of China."
                    );
                    price = 10;
                    break;
                case "Vatican Museums":
                    ((ImageView)findViewById(R.id.museumImg)).setImageResource(R.drawable.vatican);

                    ((TextView)findViewById(R.id.detailTxt)).setText(
                            "The Vatican Museums (Italian: Musei Vaticani; Latin: Musea Vaticana) are the public art and sculpture museums in the Vatican City. They display works from the immense collection amassed by the Catholic Church and the papacy throughout the centuries including several of the most renowned Roman sculptures and most important masterpieces of Renaissance art in the world. The museums contain roughly 70,000 works, of which 20,000 are on display, and currently employ 640 people who work in 40 different administrative, scholarly, and restoration departments."
                    );
                    price = 10;
                    break;
                case "Metropolitan Museum of Art":
                    ((ImageView)findViewById(R.id.museumImg)).setImageResource(R.drawable.art);

                    ((TextView)findViewById(R.id.detailTxt)).setText(
                            "The Metropolitan Museum of Art of New York City, colloquially \"the Met,\" is the largest art museum in the United States. Its permanent collection contains over 2 million works, divided among 17 curatorial departments. The main building at 1000 Fifth Avenue, along the Museum Mile on the eastern edge of Central Park in Manhattan's Upper East Side, is by area one of the world's largest art galleries. A much smaller second location, The Cloisters at Fort Tryon Park in Upper Manhattan, contains an extensive collection of art, architecture, and artifacts from medieval Europe."
                    );
                    price = 10;
                    break;
                case "British Museum":
                    ((ImageView)findViewById(R.id.museumImg)).setImageResource(R.drawable.british);

                    ((TextView)findViewById(R.id.detailTxt)).setText(
                            "The British Museum, in the Bloomsbury area of London, England, is a public institution dedicated to human history, art and culture. Its permanent collection of some eight million works is among the largest and most comprehensive in existence, having been widely collected during the era of the British Empire. It documents the story of human culture from its beginnings to the present. It was the first public national museum in the world. The Museum was established in 1753, largely based on the collections of the Irish physician and scientist Sir Hans Sloane. "
                    );
                    price = 10;
                    break;
                case "Tate Modern":
                    ((ImageView)findViewById(R.id.museumImg)).setImageResource(R.drawable.tate);

                    ((TextView)findViewById(R.id.detailTxt)).setText(
                            "Tate Modern is an art gallery located in London. It houses the United Kingdom's national collection of international modern and contemporary art, and forms part of the Tate group together with Tate Britain, Tate Liverpool and Tate St Ives. It is located in the former Bankside Power Station, in the Bankside area of the London Borough of Southwark."
                    );
                    price = 5;
                    break;
                case "National Gallery":
                    ((ImageView)findViewById(R.id.museumImg)).setImageResource(R.drawable.gallery);

                    ((TextView)findViewById(R.id.detailTxt)).setText(
                            "The National Gallery is an art museum in Trafalgar Square in the City of Westminster, in Central London. Founded in 1824, it houses a collection of over 2,300 paintings dating from the mid-13th century to 1900.\n" +
                                    "The Gallery is an exempt charity, and a non-departmental public body of the Department for Digital, Culture, Media and Sport. Its collection belongs to the government on behalf of the British public, and entry to the main collection is free of charge. In 2020, due to the COVID-19 pandemic it attracted only 1,197,143 visitors, a drop of 50 percent from 2019, but it still ranked eighth on the list of most-visited art museums in the world.\n"
                            );
                    price = 5;
                    break;
                case "Natural History Museum":
                    ((ImageView)findViewById(R.id.museumImg)).setImageResource(R.drawable.history);

                    ((TextView)findViewById(R.id.detailTxt)).setText(
                            "The Natural History Museum in London is a natural history museum that exhibits a vast range of specimens from various segments of natural history. It is one of three major museums on Exhibition Road in South Kensington, the others being the Science Museum and the Victoria and Albert Museum. The Natural History Museum's main frontage, however, is on Cromwell Road."
                    );
                    price = 5;
                    break;
                case "American Museum of Natural History":
                    ((ImageView)findViewById(R.id.museumImg)).setImageResource(R.drawable.american);

                    ((TextView)findViewById(R.id.detailTxt)).setText(
                            "The American Museum of Natural History is a natural history museum on the Upper West Side of Manhattan, New York City. In Theodore Roosevelt Park, across the street from Central Park, the museum complex comprises 26 interconnected buildings housing 45 permanent exhibition halls, in addition to a planetarium and a library. The museum collections contain over 34 million specimens of plants, animals, fossils, minerals, rocks, meteorites, human remains, and human cultural artifacts, as well as specialized collections for frozen tissue and genomic and astrophysical data, of which only a small fraction can be displayed at any given time. "
                            );
                    price = 5;
                    break;
                case "State Hermitage Museum":
                    ((ImageView)findViewById(R.id.museumImg)).setImageResource(R.drawable.russia);

                    ((TextView)findViewById(R.id.detailTxt)).setText(
                            "The State Hermitage Museum is a museum of art and culture in Saint Petersburg, Russia. The second-largest art museum in the world, it was founded in 1764 when Empress Catherine the Great acquired an impressive collection of paintings from the Berlin merchant Johann Ernst Gotzkowsky. The museum celebrates the anniversary of its founding each year on 7 December, Saint Catherine's Day. It has been open to the public since 1852. It attracted 968,604 visitors in 2020, a drop of eighty percent from 2019, due to the COVID-19 pandemic. In 2020 it ranked eleventh on the List of most visited art museums in the world"
                    );
                    price = 5;
                    break;
                default:
                    ((TextView)findViewById(R.id.detailTxt)).setText("Not added yet");
                    break;
            }

    }

    public void proceedtocart(View view) {
        Intent intent = new Intent(this, Cart.class);
        intent.putExtra("price", price);
        startActivity(intent);
    }
}