package com.example.college_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import java.util.ArrayList;

public class SplashScreen extends AppCompatActivity {
    public static ArrayList<Modelclass> list;
    public  static ArrayList<Modelclass> list1;
    public static ArrayList<Modelclass>list2;
    public static ArrayList<Modelclass>list3;
    public static ArrayList<Modelclass>list4;
    public static ArrayList<Modelclass>list5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        list5 = new ArrayList<>();
        list5.add(new Modelclass("Name of the screen that recognizes touch input is","Recog screen","Point Screen","Touch Screen","Android Screen","Touch Screen"));
        list5.add(new Modelclass("Computer Moniter is also known as","VDU","DVU","UVD","CCTV","VDU"));
        list5.add(new Modelclass("Arrange in ascending order the units of memory TB, KB, GB, MB","TB>MB>GB>KB","TB>GB>MB>KB","MB>GB>TB>KB","GB>MB>KB>TB","TB>GB>MB>KB"));
        list5.add(new Modelclass("Which one of these stores more data than a DVD ?","CD Rom","Floppy","Blue Ray Disk","Red Ray Disk","Blue Ray Disk"));
        list5.add(new Modelclass("A network of computers and other devices that is confined to a relatively small space is called?","Wide Area Network","Local Area Network","Global Network","Peer-to-Peer Network","Local Area Network"));
        list5.add(new Modelclass("Every computer connected to the Internet is identified by a unique four-part string, known as","IP address","Host name","Domain name","None of the above","IP address"));
        list5.add(new Modelclass("Which of the following statement is correct?","1 MB=2048 bytes","1 KB = 1024 bytes","1 MB = 1000 kilobytes","1 KB = 1000 bytes","1 KB = 1024 bytes"));
        list5.add(new Modelclass("Which of the following memories must be refreshed many times per second?","Static RAM","Dynamic RAM","EPROM","ROM","Dynamic RAM"));
        list5.add(new Modelclass(".PNG refers to","Image file","Movie/animation file","Audio file","MS Office document","Image file"));
        list5.add(new Modelclass("USB is a device used to store data and it stands for","Unlimited Service Band","Unlimited Serial Bus","Universal Serial Bus","Universal Service Bus","Universal Serial Bus"));
        list5.add(new Modelclass("The fourth generation computers are based on","Transistor","Integrated circuit","VLSI microprocessor","ULSI microprocessor","VLSI microprocessor"));
        list5.add(new Modelclass("All the following are computer input devices except for","Keyboard","Printer","Mouse","Joy Stick","Printer"));
        list5.add(new Modelclass("Malware is the short form for malicious software and used to refer to","Spyware","Worm","Virus","All of the above","All of the above"));
        list5.add(new Modelclass("What is the best way to protect your hard drive data?","Scanning","Backup","Defragmentation","Delete junk","Backup"));
        list5.add(new Modelclass("A byte is equivalent to","2 bits","6 bits","8 bits","10 bits","8 bits"));
        list5.add(new Modelclass("A standard computer keyboard has how many keys?","84","94","104","114","104"));
        list5.add(new Modelclass("HTTP stands for:","Hyper Text Transfer Protocol","Hyper Timed Text Protocol","Hopper Transfer Text Protocol","Hopper Text Timer Protocol","Hyper Text Transfer Protocol"));
        list5.add(new Modelclass("A character has how many bits:","4","8","12","16","8"));
        list5.add(new Modelclass("In a computer network which device acts as a traffic cop:","Router","Hub","Switch","Modem","Switch"));
        list5.add(new Modelclass("Which protocol sends electronic mail?","Outlook Express","POP3","FTP","SMTP","SMTP"));

        list4 = new ArrayList<>();
        list4.add(new Modelclass("The virus is","carbohydrate","nucleic acid and protein","lipid and carbohydrate","protein and lipid","nucleic acid and protein"));
        list4.add(new Modelclass("Which is the largest part of the brain?","Medulla oblongata","Cerebellum","Cerebrum","None of these","Cerebrum"));
        list4.add(new Modelclass("The virus of AIDS affects the growth of","Heamoglobin","RBCs in blood","Grey cells in brain","T cells in blood","T cells in blood"));
        list4.add(new Modelclass("Name the organs of human body that never rest","Heart and Kidney","Tonsils and Heart","Appendix and Kidney","Brain and Kidney","Heart and Kidney"));
        list4.add(new Modelclass("Which one of the following is the heaviest metal?","Uranium","Aluminium","Silver","Copper","Uranium"));
        list4.add(new Modelclass("The acid that is secreted in the stomach is","HCL","H2SO4","H2CO3","HNO3","HCL"));
        list4.add(new Modelclass("Golden rice has the highest quantity of","Vitamin A","Vitamin B","Vitamin C","Vitamin K","Vitamin A"));
        list4.add(new Modelclass("Which among the following animals has the largest Intestine?","Cow","Lion","Tiger","Monkey","Cow"));
        list4.add(new Modelclass("Cholera bacillus was discovered by","Robert Koch","Louis Pasteur","Joseph Lister","Ronald Ross","Robert Koch"));
        list4.add(new Modelclass("Which of the following organelles is present in bacteria or prokaryotic cell?","Mitochondria","Golgi bodies","Ribosomes","Vacuoles","Ribosomes"));
        list4.add(new Modelclass("Mercury is used in barometers due to its","High density","High lost","Weight","Lusture","High density"));
        list4.add(new Modelclass("Which one of the following bacteria helps in improving the soil fertility?","Clostridium","Salmonella","Staphylococcus","Rhizobium","Rhizobium"));
        list4.add(new Modelclass("The branch of botany under which fungi is studied is called","embryology","phycology","microbiology","mycology","mycology"));
        list4.add(new Modelclass("What function does blood perform in body?","takes oxygen to all parts","helps in liquidity","helps in erection","helps in digestion","takes oxygen to all parts"));
        list4.add(new Modelclass("Human body’s main organ of balance is located in","inner part of ear","top part of vertebral column","front part of brain","middle","top part of vertebral column"));
        list4.add(new Modelclass("Which of the following is NOT a viral disease?","Epilepsy","Influenza","Measles","Chicken pox","Epilepsy"));
        list4.add(new Modelclass("Which gland in the human body is called Master Gland?","Thyroid gland","Lever","Bulbourethral gland","Pituitary gland","Pituitary gland"));
        list4.add(new Modelclass(" _____ is a water soluble vitamin","Vitamin A","Vitamin B","Vitamin C","Vitamin D","Vitamin C"));
        list4.add(new Modelclass("The unit structure of which gene is made up of","RNA","DNA","Nucleotides","Endoplasmic reticulum","DNA"));
        list4.add(new Modelclass("The colour of silver chloride precipitate is","Yellow","Red","Black","White","White"));

        list3 = new ArrayList<>();
        list3.add(new Modelclass("Which one among the following satellites is used to reflect the radio signals back to the Eath?","Active satellite","Passive satellite","Natural satellite","None of these","Passive satellite"));
        list3.add(new Modelclass("Evaporation occurs at","The middle of the liquid","The bottom of the liquid","The surface of the liquid","Both at surface and bottom of the liquid","The surface of the liquid"));
        list3.add(new Modelclass("One fathom is equal to","6 metres","6 feet","60 feet","60 cms","6 feet"));
        list3.add(new Modelclass("When a bar magnet is cut into two equal halves, the pole strength of each piece","remains the same","becomes double","becomes half","becomes zero","becomes half"));
        list3.add(new Modelclass("L.P.G. is mostly liquefied","Oxygen","Hydrogen","Methane","Butane","Butane"));
        list3.add(new Modelclass("In automatic wrist watches energy is provided by","Battery","Liquid crystal","Manual binding","Different movements of our hand","Different movements of our hand"));
        list3.add(new Modelclass("Kerosene oil rises up in a wick of a lantern because of","Diffusion of the oil through the wick","Surface tension","Buoyant force of air","The gravitational pull of the wick","Surface tension"));
        list3.add(new Modelclass("The maximum displacement of a particle in the upward direction is","Node","Crest","Wavelength","Trough","Crest"));
        list3.add(new Modelclass("White light is made up of seven colours. What is the method of separating the colours?","By passing it through a prism","By filtration","Can’t be separated","Both (a) and (b)","By passing it through a prism"));
        list3.add(new Modelclass("Who developed the hydrogen bomb?","Samual Cohen","Adberd Taylor","J. Robert Opan Heemar","Bernor Bon Bron","J. Robert Opan Heemar"));
        list3.add(new Modelclass("When ice melts, then the","volume decreases","volume increases","mass increases","mass decreases","volume decreases"));
        list3.add(new Modelclass("Nautical mile is a unit of distance used in","Measuring the boundaries of a nation","Road mile","Astronomy","Navigation","Navigation"));
        list3.add(new Modelclass("A mirror produces magnified erect image of an object. The nature of the mirror is","Convex","Concave","Plane","Neither concave nor convex","Concave"));
        list3.add(new Modelclass("The position of the object in a camera is","At F","At 2F","Beyond 2F","In between F and 2F","Beyond 2F"));
        list3.add(new Modelclass("For the isothermal process ideal gas equation is expressed as","PV = RTy","PV = RT","PVy = RT","p/V = RT","PV = RT"));
        list3.add(new Modelclass("The velocity of light in vacuum or air is","2 x 10 4 m/sec","9 x 10 2 m/sec","3 x 10 11 m/sec","3 x 10 8 m/sec","3 x 10 8 m/sec"));
        list3.add(new Modelclass("The melting point of ice in the celsius scale is","0°C","-10°C","100°C","-273°C","0°C"));
        list3.add(new Modelclass("What has its maximum density at","O°C","4°C","-4°C","100°C","4°C"));
        list3.add(new Modelclass("An example of scalar quantity is","Acceleration","Speed","Momentum","Displacement","Speed"));
        list3.add(new Modelclass("1 horse power is equal to","722 watts","738 watts","746 watts","756 watts","746 watts"));

        list2 = new ArrayList<>();
        list2.add(new Modelclass("Hydrogen bomb is based on the principle of","nuclear fission","nuclear fusion","natural radioactivity","artificial radioactivity","nuclear fusion"));
        list2.add(new Modelclass("Atom was a name given by","Democritus","Bohr","Rutherford","Archimedes","Democritus"));
        list2.add(new Modelclass("The milk is an example of","Air-solution","Colloidal solution","Emulsion","Solution","Emulsion"));
        list2.add(new Modelclass("Sulphur is extracted by","Contact process","Frasch process","Solvay process","Haber process","Frasch process"));
        list2.add(new Modelclass("Formalin is an aqueous solution of","Methyl acetate","Propanaone","Methanol","Ethanol","Methanol"));
        list2.add(new Modelclass("The pH of lemon juice is","1.0 - 3.0","2.2 - 2.4","4.5 - 5.5","6.5 - 7.5","2.2 - 2.4"));
        list2.add(new Modelclass("Hydrogen sulphide gas has","Rotten egg smell","Pungent smell","Fruity smell","Smell","Rotten egg smell"));
        list2.add(new Modelclass("Bleaching powder is prepared by passing chlorine through","Quicklime","Dry slaked lime","Milk of lime","Limestone","Dry slaked lime"));
        list2.add(new Modelclass("The number of mole of solute per litre solution is called","Molality","Molarity","Normality","None of these","Molality"));
        list2.add(new Modelclass("The atomicity of sulphur is","2","4","6","8","8"));
        list2.add(new Modelclass("Which one of the following is not an element?","Nitrogen","Silica","Hydrogen","Oxygen","Silica"));
        list2.add(new Modelclass("Epoxy resins are used as","Moth repellants","Detergents","Adhesives","Insecticides","Adhesives"));
        list2.add(new Modelclass("Metals generally have","High evaporating capacity","Softness","Low melting points","High melting points","High melting points"));
        list2.add(new Modelclass("The plant cell will shrink when placed in","An isotonic solution","Hypertonic solution","Water","Hypotonic solution","Hypertonic solution"));
        list2.add(new Modelclass("In the Ostwald’s process for manufacture of HNO3 used is","Fe","Na","Mo","Pt","Pt"));
        list2.add(new Modelclass("Mendeleev’s periodic table was formulated based on","Atomic number","Atomic mass","Mass number","Number of neutrons","Atomic mass"));
        list2.add(new Modelclass("Which of the following is used in softening of hard water?","Bleaching powder","Baking soda","Washing soda","Plaster of Paris","Washing soda"));
        list2.add(new Modelclass("Which fertilizer is assimilated directly by the plant?","Nitro lim","Humus","Muriatic of potash","Super phosphate","Muriatic of potash"));
        list2.add(new Modelclass("Boiling point of nitrogen is","-32°C","-183°C","-186°C","-196°C","-196°C"));
        list2.add(new Modelclass("Which of the following shows electrical conduction?","Sodium","Potassium","Diamond","Graphite","Graphite"));

        list1 = new ArrayList<>();
        list1.add(new Modelclass("Our sir teaches Mathematics______ English","across","besides","beside","both","besides"));
        list1.add(new Modelclass("Our country is spiritual country, theirs _____ religious","is","are","also","have","is"));
        list1.add(new Modelclass("Please,come ______ the bathroom","out of","over","on","in","out of"));
        list1.add(new Modelclass("Please, do not laugh _____ those beggars","for","against","at","from","at"));
        list1.add(new Modelclass("Please,stop _____ so many mistakes.","to make","make","making","makes","making"));
        list1.add(new Modelclass("Her thinking leans ____ democracy.","with","towards","for","None of these","towards"));
        list1.add(new Modelclass("He got too tired _____ over work","because of","because off","on","for","because of"));
        list1.add(new Modelclass("_____ his principles, he has to be very careful.","with regard of","with regard on","with regard to","None of these","with regard to"));
        list1.add(new Modelclass("He crossed the broken bridge ____ warning.","in spite of","in spite off","on","about","in spite of"));
        list1.add(new Modelclass("The train ____ as fast as the bus.","went","running","moves","going","moves"));
        list1.add(new Modelclass("____ it help you in your studies ?","will","was","is","are","will"));
        list1.add(new Modelclass("She ____ in the sun for 1 hour.","sitting","has been sitting","has been sit","has sit","has been sitting"));
        list1.add(new Modelclass("I ____ never seen such a picture before.","did","was","have","has","have"));
        list1.add(new Modelclass("Sounding the same but spelt differently ?","Symphonious","Homophonous","Synonyms","Saminymous","Homophonous"));
        list1.add(new Modelclass("I was delighted _____ her answer.","On","At","For","In","At"));
        list1.add(new Modelclass("You can see the house _____ the trees.","To","On","With","Among","Among"));
        list1.add(new Modelclass("Do you want to speak _____ me?","With","To","Above","Over","To"));
        list1.add(new Modelclass("I have not _______ from him so far.","Hear","Seen","Heard","Listen","Heard"));
        list1.add(new Modelclass("They ____ very happy seeing you here.","Shall","Will","Will be","Were be","Will be"));
        list1.add(new Modelclass("Choose the correctly spelt word","Humarous","Humorous","Humurous","Humerous","Humorous"));

        list= new ArrayList<>();
        list.add(new Modelclass("A line which cuts a pair of parallel lines is called","tangent","chord","traversal","intersector","traversal"));
        list.add(new Modelclass("An angle whose value is ____, is called complete angle","180°","240°","360°","none of the above","360°"));
        list.add(new Modelclass("For some integer n, the odd integer is represented in the form of","n","n+1","2n+1","2n","2n+1"));
        list.add(new Modelclass("What is the average of first 150 natural numbers?","70","70.5","75","75.5","75.5"));
        list.add(new Modelclass("What is the rate of discount if a car which price was $4,000 was sold for $3,200 ?","14%","16%","18%","20%","20%"));
        list.add(new Modelclass("106 × 106 – 94 × 94 = ?","2004","2400","1980","1974","2400"));
        list.add(new Modelclass("In a class of 40 students 20% are girls. How many boys are there in the class?","26","28","30","32","32"));
        list.add(new Modelclass("What is the distance traveled by a car which traveled at a speed of 80 km/hr for 3 hours and 30 minutes?","275km","280km","285km","290km","280km"));
        list.add(new Modelclass("|–4| + |4| – 4 + 4 = ?","0","2","4","8","8"));
        list.add(new Modelclass(" 0.003 × 0.02 = ?"," 0.06","0.006","0.0006","0.00006","0.00006"));
        list.add(new Modelclass("What is the value of x in the equation 3x – 15 – 6 = 0 ?","7","8","9","-9","7"));
        list.add(new Modelclass("What comes next in the sequence: 2, 4, 10, 28, ___ ?","64","70","76","82","82"));
        list.add(new Modelclass("How many feet there are in 5 meters? If 1 meter = 3.281 feet.","15.505","15.905","16.405","16.805","16.405"));
        list.add(new Modelclass("If A completes a particular work in 4 days and B completes the same work in 12 days. How many days will it take if they work together?","1","2","3","4","3"));
        list.add(new Modelclass("If the cost of 12 eggs is $40. What will be the cost of 3 eggs?","$9","$10","$11","$12","$10"));
        list.add(new Modelclass("If the sum of two numbers is 16, and their product is 63. Then the larger number is","9","10","11","12","9"));
        list.add(new Modelclass("What is the number, if 40% of the number is 380?","930","940","950","960","950"));
        list.add(new Modelclass("What is the value of x in the equation: 0.2x − 0.03 = 0.4 × 0.05 ?","0.20","0.02","0.25","0.025","0.25"));
        list.add(new Modelclass("-4^2+(-4)^2=? ","0","1","32","-32","0"));
        list.add(new Modelclass("The cost of an article is Rs.160. What should be the selling price in rupees to obtain a profit of 15 percent?","180","182","184","186","184"));


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this,MainActivity.class);
                startActivity(intent);

            }
        },1500);
    }
}