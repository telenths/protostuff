// Generated by http://code.google.com/p/protostuff/ ... DO NOT EDIT!

package com.dyuproject.protostuff.benchmark;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.dyuproject.protostuff.Input;
import com.dyuproject.protostuff.IOUtil;
import com.dyuproject.protostuff.Output;
import com.dyuproject.protostuff.Message;
import com.dyuproject.protostuff.Schema;
import com.dyuproject.protostuff.UninitializedMessageException;

public final class Media implements Serializable, Message<Media>
{
    public enum Player implements com.dyuproject.protostuff.EnumLite<Player>
    {
        JAVA(0),
        FLASH(0);
        
        public final int number;
        
        private Player (int number)
        {
            this.number = number;
        }
        
        public int getNumber()
        {
            return number;
        }
        
        public static Player valueOf(int number)
        {
            switch(number) 
            {
                case 0: return JAVA;
                default: return null;
            }
        }
    }

    public static Schema<Media> getSchema()
    {
        return SCHEMA;
    }

    public static Media getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final Media DEFAULT_INSTANCE = new Media();

    
    // non-private fields
    // see http://developer.android.com/guide/practices/design/performance.html#package_inner
    String uri;
    String title;
    Integer width;
    Integer height;
    String format;
    Long duration;
    Long size;
    Integer bitrate;
    List<String> person;
    Player player;
    String copyright;

    public Media()
    {
    }

    public Media(
        String uri
    )
    {
        this();
        this.uri = uri;
    }

    // getters and setters

    // uri

    public String getUri()
    {
        return uri;
    }

    public void setUri(String uri)
    {
        this.uri = uri;
    }

    // title

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    // width

    public Integer getWidth()
    {
        return width;
    }

    public void setWidth(Integer width)
    {
        this.width = width;
    }

    // height

    public Integer getHeight()
    {
        return height;
    }

    public void setHeight(Integer height)
    {
        this.height = height;
    }

    // format

    public String getFormat()
    {
        return format;
    }

    public void setFormat(String format)
    {
        this.format = format;
    }

    // duration

    public Long getDuration()
    {
        return duration;
    }

    public void setDuration(Long duration)
    {
        this.duration = duration;
    }

    // size

    public Long getSize()
    {
        return size;
    }

    public void setSize(Long size)
    {
        this.size = size;
    }

    // bitrate

    public Integer getBitrate()
    {
        return bitrate;
    }

    public void setBitrate(Integer bitrate)
    {
        this.bitrate = bitrate;
    }

    // person

    public List<String> getPersonList()
    {
        return person;
    }

    public void setPersonList(List<String> person)
    {
        this.person = person;
    }

    // player

    public Player getPlayer()
    {
        return player;
    }

    public void setPlayer(Player player)
    {
        this.player = player;
    }

    // copyright

    public String getCopyright()
    {
        return copyright;
    }

    public void setCopyright(String copyright)
    {
        this.copyright = copyright;
    }

    // java serialization

    private void readObject(ObjectInputStream in) throws IOException
    {
        int length = in.readInt();
        byte[] data = new byte[length];
        for(int offset = 0; length > 0; length -= offset)
            offset = in.read(data, offset, length);
        IOUtil.mergeFrom(data, this);
    }

    private void writeObject(ObjectOutputStream out) throws IOException
    {
        byte[] data = IOUtil.toByteArray(this);
        out.writeInt(data.length);
        out.write(data);
    }

    // message method

    public Schema<Media> cachedSchema()
    {
        return SCHEMA;
    }

    static final Schema<Media> SCHEMA = new Schema<Media>()
    {
        // schema methods

        public Media newMessage()
        {
            return new Media();
        }

        public Class<Media> typeClass()
        {
            return Media.class;
        }

        public boolean isInitialized(Media message)
        {
            return 
                message.uri != null;
        }

        public void mergeFrom(Input input, Media message) throws IOException
        {
            while(true)
            {
                int number = input.readFieldNumber(this);
                switch(number)
                {
                    case 0:
                        return;
                    case 1:
                        message.uri = input.readString();
                        break;
                    case 2:
                        message.title = input.readString();
                        break;
                    case 3:
                        message.width = input.readInt32();
                        break;
                    case 4:
                        message.height = input.readInt32();
                        break;
                    case 5:
                        message.format = input.readString();
                        break;
                    case 6:
                        message.duration = input.readInt64();
                        break;
                    case 7:
                        message.size = input.readInt64();
                        break;
                    case 8:
                        message.bitrate = input.readInt32();
                        break;
                    case 9:
                        if(message.person == null)
                            message.person = new ArrayList<String>();
                        message.person.add(input.readString());
                        break;
                    case 10:
                        message.player = Player.valueOf(input.readEnum());
                        break;
                    case 11:
                        message.copyright = input.readString();
                        break;
                    default:
                        input.handleUnknownField(number, this);
                }   
            }
        }


        public void writeTo(Output output, Media message) throws IOException
        {
            if(message.uri == null)
                throw new UninitializedMessageException(message);
            output.writeString(1, message.uri, false);

            if(message.title != null)
                output.writeString(2, message.title, false);

            if(message.width != null)
                output.writeInt32(3, message.width, false);

            if(message.height != null)
                output.writeInt32(4, message.height, false);

            if(message.format != null)
                output.writeString(5, message.format, false);

            if(message.duration != null)
                output.writeInt64(6, message.duration, false);

            if(message.size != null)
                output.writeInt64(7, message.size, false);

            if(message.bitrate != null)
                output.writeInt32(8, message.bitrate, false);

            if(message.person != null)
            {
                for(String person : message.person)
                {
                    if(person != null)
                        output.writeString(9, person, true);
                }
            }

            if(message.player != null)
                 output.writeEnum(10, message.player.number, false);

            if(message.copyright != null)
                output.writeString(11, message.copyright, false);
        }

        public String getFieldName(int number)
        {
            switch(number)
            {
                case 1: return "uri";
                case 2: return "title";
                case 3: return "width";
                case 4: return "height";
                case 5: return "format";
                case 6: return "duration";
                case 7: return "size";
                case 8: return "bitrate";
                case 9: return "person";
                case 10: return "player";
                case 11: return "copyright";
                default: return null;
            }
        }

        public int getFieldNumber(String name)
        {
            Integer number = fieldMap.get(name);
            return number == null ? 0 : number.intValue();
        }

        final java.util.HashMap<String,Integer> fieldMap = new java.util.HashMap<String,Integer>();
        {
            fieldMap.put("uri", 1);
            fieldMap.put("title", 2);
            fieldMap.put("width", 3);
            fieldMap.put("height", 4);
            fieldMap.put("format", 5);
            fieldMap.put("duration", 6);
            fieldMap.put("size", 7);
            fieldMap.put("bitrate", 8);
            fieldMap.put("person", 9);
            fieldMap.put("player", 10);
            fieldMap.put("copyright", 11);
        }
    };
}