/**
 * Created by liuligang on 2019/1/2.
 */

//建议值[16,9]
var table = [];
var maxCol = 16,maxRow=9;

var camera, scene, renderer;
var controls;
var radius = 100, theta = 0;

var objects = [];
var targets = { table: [], sphere: [], helix: [], grid: [] };



function init() {

    camera = new THREE.PerspectiveCamera( 40, window.innerWidth / window.innerHeight, 1, 10000 );
    camera.position.z = 3000;

    scene = new THREE.Scene();


    table.forEach(function(val,index){
        var element = document.createElement( 'div' );
        element.className = 'element';
        element.style.backgroundColor = 'rgba(0,127,127,' + ( Math.random() * 0.5 + 0.25 ) + ')';

        var a = document.createElement('a');
        a.href =  val.resource;
        a.setAttribute('data-lightbox','roadtrip');
        a.setAttribute('title',a.href.substr(a.href.lastIndexOf('/')+1));

        var image=new Image();
        image.src=val.src;
        //a.appendChild(image)

        element.appendChild( image );
//        element.setAttribute('style',"background-image: url(" + val.src + ")");
        a.appendChild(element)

        //var object = new THREE.CSS3DObject( element );
        var object = new THREE.CSS3DObject( a );
        object.position.x = Math.random() * 4000 - 2000;
        object.position.y = Math.random() * 4000 - 2000;
        object.position.z = Math.random() * 4000 - 2000;
        scene.add( object );

        objects.push( object );

        //table
        var object = new THREE.Object3D();
        object.position.x = (val.col * 181 ) - 1330;
        object.position.y = - (val.row * 120 ) + 990;
        targets.table.push( object );
    });

    // sphere

    var vector = new THREE.Vector3();

    for ( var i = 0, l = objects.length; i < l; i ++ ) {

        var phi = Math.acos( -1 + ( 2 * i ) / l );
        var theta = Math.sqrt( l * Math.PI ) * phi;

        var object = new THREE.Object3D();

        object.position.x = 800 * Math.cos( theta ) * Math.sin( phi );
        object.position.y = 800 * Math.sin( theta ) * Math.sin( phi );
        object.position.z = 800 * Math.cos( phi );

        vector.copy( object.position ).multiplyScalar( 2 );

        object.lookAt( vector );

        targets.sphere.push( object );

    }

    // helix

    var vector = new THREE.Vector3();

    for ( var i = 0, l = objects.length; i < l; i ++ ) {

        //var phi = i * 0.175 + Math.PI;
        var phi = i * 0.205 + Math.PI;

        var object = new THREE.Object3D();

        object.position.x = 900 * Math.sin( phi );
        object.position.y = - ( i * 8 ) + 450;
        object.position.z = 900 * Math.cos( phi );

        vector.x = object.position.x * 2;
        vector.y = object.position.y;
        vector.z = object.position.z * 2;

        object.lookAt( vector );

        targets.helix.push( object );

    }

    // grid

    for ( var i = 0; i < objects.length; i ++ ) {

        var object = new THREE.Object3D();

        object.position.x = ( ( i % 5 ) * 400 ) - 800;
        object.position.y = ( - ( Math.floor( i / 5 ) % 5 ) * 400 ) + 800;
        object.position.z = ( Math.floor( i / 25 ) ) * 1000 - 2000;

        targets.grid.push( object );

    }

    //

    renderer = new THREE.CSS3DRenderer();
    renderer.setSize( window.innerWidth, window.innerHeight );
    renderer.domElement.style.position = 'absolute';
    document.getElementById( 'container' ).appendChild( renderer.domElement );

    //

    controls = new THREE.TrackballControls( camera, renderer.domElement );
    controls.rotateSpeed = 0.5;
    controls.minDistance = 500;
    controls.maxDistance = 6000;
    controls.addEventListener( 'change', render );

    var button = document.getElementById( 'table' );
    button.addEventListener( 'click', function ( event ) {

        transform( targets.table, 2000 );

    }, false );

    var button = document.getElementById( 'sphere' );
    button.addEventListener( 'click', function ( event ) {

        transform( targets.sphere, 2000 );

    }, false );

    var button = document.getElementById( 'helix' );
    button.addEventListener( 'click', function ( event ) {

        transform( targets.helix, 2000 );

    }, false );

    var button = document.getElementById( 'grid' );
    button.addEventListener( 'click', function ( event ) {

        transform( targets.grid, 2000 );

    }, false );

    //transform( targets.helix, 5000 );
    transform( targets.table, 2000 );
    //

    window.addEventListener( 'resize', onWindowResize, false );

}

function transform( targets, duration ) {

    TWEEN.removeAll();

    for ( var i = 0; i < objects.length; i ++ ) {

        var object = objects[ i ];
        var target = targets[ i ];

        new TWEEN.Tween( object.position )
            .to( { x: target.position.x, y: target.position.y, z: target.position.z }, Math.random() * duration + duration )
            .easing( TWEEN.Easing.Exponential.InOut )
            .start();

        new TWEEN.Tween( object.rotation )
            .to( { x: target.rotation.x, y: target.rotation.y, z: target.rotation.z }, Math.random() * duration + duration )
            .easing( TWEEN.Easing.Exponential.InOut )
            .start();

    }

    new TWEEN.Tween( this )
        .to( {}, duration * 2 )
        .onUpdate( render )
        .start();
}

function onWindowResize() {

    camera.aspect = window.innerWidth / window.innerHeight;
    camera.updateProjectionMatrix();

    renderer.setSize( window.innerWidth, window.innerHeight );

}

function animate() {

    requestAnimationFrame( animate );

    TWEEN.update();
    controls.update();
    // render();
    //move( -1 );

}

function render() {
    /*
     theta += 0.1;
     */

/*
    if (!isMove) {
              camera.position.x += Math.PI * 1;
				camera.position.y += 5;
				camera.position.z += 0.1;
    }
    camera.lookAt( scene.position );
*/
    renderer.render( scene, camera );

}

/**
 ** 控制自动旋转
*/
/*
var isMove = false;

document.onmousedown = function(e) {
    isMove = true;
};

document.onmouseup = function() {
    isMove = false;
    animate();
}
*/

// 说明：用 JavaScript 实现网页图片等比例缩放
function resizeImg(image,distWidth,distHeight)
{
    srcWidth = image.width;
    srcHeight = image.height;
    var ratio = 1;
    if(srcWidth>0 && srcHeight>0)
    {
        if(srcWidth/srcHeight>= distWidth/distHeight)
        {
            if(srcWidth>distWidth)
            {
                ratio = distWidth/srcWidth;
            }
        }
        else
        {
            if(srcHeight>distHeight)
            {
                ratio = distHeight/srcHeight;
            }
        }
    }
    var width = srcWidth*ratio;
    var heigh = srcHeight*ratio;

    image.style.width = width.toString() + 'px';
    image.style.height = heigh.toString() + 'px';

    if(width < distWidth)
        image.style.paddingLeft = ((distWidth - width)/2).toString() + 'px';

    if(heigh < distHeight)
        image.style.paddingTop = ((distHeight - heigh)/2).toString() + 'px';
}

//获得指定文件夹图片名称列表，同时设置图片的位置
function getImgs (uid){
    var col = 0;
    var row = 0;
    $.ajax({
        type: "GET",
        url: "/images",
        //data: "",
        dataType: "json",
        success: function(data){

            $.each(data,function(index,value)
            {
                //console.log(index,value);
                data[index].col = col++;
                data[index].row = row;
                if(col > maxCol){
                    col = 1;
                    row ++;
                }
                if(row > maxRow){
                    return;
                }
            });
//            console.log(data);
            table = data;
            init();
            animate();

        },
        error: function(XMLHttpRequest, textStatus, errorThrown){
            console.error(XMLHttpRequest, textStatus, errorThrown);
        }
    });

}