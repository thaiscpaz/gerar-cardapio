import React from 'react';
import { Grid } from '@material-ui/core'
import { makeStyles } from '@material-ui/core/styles';
import { Tag } from '../components/Tag';
import breakfast from '../assets/images/breakfast.png';
import lunch from '../assets/images/lunch.png';
import dinner from '../assets/images/dinner.png';
import snack from '../assets/images/snack.png';
import dessert from '../assets/images/dessert.png';
import vegetarian from '../assets/images/vegetarian.png';
import main from '../assets/images/main.png';
import pasta from '../assets/images/pasta.png';
import drink from '../assets/images/drink.png';
import salad from '../assets/images/salad.png';
import soup from '../assets/images/soup.png';
import side from '../assets/images/side.png';

const useStyles = makeStyles((theme) => ({
    tag: {
        width: 134,
        height: 18,
        left: 0,
        top: 0,
        display: 'flex',
    },
    image: {
        marginTop:10
    }
}));

//let history = useHistory();

/* function login() {
    history.push("/login");
} */

function Home() {

    const classes = useStyles();

    return (
        <>

            <Grid container xs={12} >
                <Grid xs={2} />

                <Grid xs={2} >
                    <Tag> café da manhã </Tag>
                    <img src={breakfast} alt="foto de um café da manhã" className={classes.image}/>
                </Grid>

                <Grid xs={2} >
                    <Tag> almoço </Tag>
                    <img src={lunch} alt="foto de um lmoço" className={classes.image}/>
                </Grid>

                <Grid xs={2} >
                    <Tag> jantar </Tag>
                    <img src={dinner} alt="foto de um jantar" className={classes.image}/>
                </Grid>

                <Grid xs={2} >
                    <Tag> lanche </Tag>
                    <img src={snack} alt="foto de um hamburguer" className={classes.image}/>
                </Grid>

                <Grid xs={2} />
            </Grid>

            <Grid container xs={12} >
                <Grid xs={2} />

                <Grid xs={2} >
                    <Tag> salada </Tag>
                    <img src={salad} alt="foto de um café da manhã" className={classes.image}/>
                </Grid>

                <Grid xs={2} >
                    <Tag> sobremesa </Tag>
                    <img src={dessert} alt="foto de um lmoço" className={classes.image}/>
                </Grid>

                <Grid xs={2} >
                    <Tag> vegetariano </Tag>
                    <img src={vegetarian} alt="foto de um jantar" className={classes.image}/>
                </Grid>

                <Grid xs={2} >
                    <Tag> pasta </Tag>
                    <img src={pasta} alt="foto de um hamburguer" className={classes.image}/>
                </Grid>

                <Grid xs={2} />
            </Grid>

            <Grid container xs={12} >
                <Grid xs={2} />

                <Grid xs={2} >
                    <Tag> sopa </Tag>
                    <img src={soup} alt="foto de um café da manhã" className={classes.image}/>
                </Grid>

                <Grid xs={2} >
                    <Tag> acompanhamento </Tag>
                    <img src={side} alt="foto de um lmoço" className={classes.image}/>
                </Grid>

                <Grid xs={2} >
                    <Tag> prato principal </Tag>
                    <img src={main} alt="foto de um jantar" className={classes.image}/>
                </Grid>

                <Grid xs={2} >
                    <Tag> bebidas </Tag>
                    <img src={drink} alt="foto de um hamburguer" className={classes.image}/>
                </Grid>

                <Grid xs={2} />
            </Grid>

        </>

    );
}

export default Home;