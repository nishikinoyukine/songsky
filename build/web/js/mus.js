var audiotypes={
        "mp3": "audio/mpeg",
        "mp4": "audio/mp4",
        "ogg": "audio/ogg",
        "wav": "audio/wav"
    }

    function ss_soundbits(sound){
        var audio_element = document.createElement('audio')
        if (audio_element.canPlayType){
            for (var i=0; i<arguments.length; i++){
                var source_element = document.createElement('source')
                source_element.setAttribute('src', arguments[i])
                if (arguments[i].match(/\.(\w+)$/i))
                    source_element.setAttribute('type', audiotypes[RegExp.$1])
                audio_element.appendChild(source_element)
            }
            audio_element.load()
            audio_element.playclip=function(){
                if (audio_element.paused) {
                     audio_element.play()
                     }else{
                      audio_element.pause()
                      audio_element.currentTime = 0
                     }
               
            }
            return audio_element
        }
    }

 var song1  = ss_soundbits("audio/punk.mp3");
    var song2  = ss_soundbits("audio/fall.mp3");
    var song3  = ss_soundbits("audio/tenshi.mp3");
    var song4  = ss_soundbits("audio/stella.mp3");
    var song5  = ss_soundbits("audio/fell.mp3");
    var song6  = ss_soundbits("audio/pho.mp3");
    var song7  = ss_soundbits("audio/eye.mp3");
    var song8  = ss_soundbits("audio/cob.mp3");